// Importing Dependencies:
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class EmailNotification implements Notifiable {
    // Instance Variables to Specify Mailing Protocols:
    private final String smtpHost = "smtp.gmail.com";
    private final String smtpPort = "587";
    private final String senderEmail = "failingoop@gmail.com";
    private final String senderPassword = "evdlafhoynqlxbkj";  // Use App Password, NOT main Gmail password

    // Implementing Abstract Method:
    @Override
    public void sendNotification(String recipient, String messageText, String subject) throws NotificationException
    {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);

        Session session = Session.getInstance(props,
                new Authenticator()
                {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(senderEmail, senderPassword);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
            System.out.println("[EMAIL SENT] To: " + recipient);
        } catch (MessagingException e)
        {
            throw new NotificationException("Failed to send email: " + e.getMessage());
        }
    }
}

