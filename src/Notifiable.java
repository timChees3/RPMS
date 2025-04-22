public interface Notifiable
{
    // Abstract Method with Exception Handling:
    void sendNotification(String recipient, String message, String subject) throws NotificationException;
}
