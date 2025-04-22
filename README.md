# RPMS

### 1. Install Java (JDK)

Make sure you have Java installed on your system. Java 8 or later is recommended.

### 2. Create Project Structure

Create a folder (e.g., RPMS) and place all .java files in the same package or in the default package.

```aiignore
RPMS/                                   (Root)
 ┣━━ README.md                          (Instructions)
 ┗━━ src/
     ┣━━ Administrator.java
     ┣━━ Appointment.java
     ┣━━ AppointmentManager.java
     ┣━━ ChatClient.java
     ┣━━ ChatServer.java
     ┣━━ Doctor.java
     ┣━━ EmailNotification.java
     ┣━━ EmergencyAlert.java
     ┣━━ Feedback.java
     ┣━━ Main.java                      (Demo)
     ┣━━ MedicalHistory.java
     ┣━━ Notifiable.java
     ┣━━ NotificationException.java
     ┣━━ NotificationService.java
     ┣━━ PanicButton.java
     ┣━━ Patient.java
     ┣━━ Prescription.java
     ┣━━ SMSNotification.java
     ┣━━ User.java
     ┣━━ VideoCall.java
     ┣━━ VitalSign.java
     ┗━━ VitalsDatabase.java


```

### 3. Compile

From your project directory, open a terminal/command prompt and run:

```
javac *.java
```
This command compiles all the Java files.

### 4. Run

Then run the Main class:

```
java Main
```
You will see console outputs showing each step: adding doctors/patients, uploading vitals, viewing feedback, etc.

---

## Demo-Main Program:
#### `Main.java`:

```java
public class Main {
    public static void main(String[] args) {

        // CREATE ADMIN, DOCTOR, PATIENT:
        Administrator admin = new Administrator("Spongebob", "Squarepants", "spongebobsp@gmail.com", "0333 3333333", 'M', 20, "Cartoon Network");
        Patient patient1 = new Patient("Patrick", "Star", "patrick@gmail.com", "+923222222222", 'M', 22, "Cartoon Street");
        Doctor doctor1 = new Doctor("Mr.", "Krabs", "mkrabs@gmail.com", "+923111111111", 'M', 39, "Bikini Bottom");

        admin.addPatient(patient1);
        admin.addDoctor(doctor1);

        // APPOINTMENT:
        AppointmentManager appointmentManager = new AppointmentManager();
        Appointment appointment1 = new Appointment("2025-04-10", "12:30", patient1, doctor1);
        if (doctor1.getAppointments().size() < 5)
        {
            patient1.scheduleAppointment(appointmentManager, appointment1);
            appointmentManager.approveAppointment(appointment1);
            doctor1.addAppointment(appointment1);
        } else
        {
            System.out.println("Appointment Cancelled");
        }

        // PRESCRIPTION & FEEDBACK:
        Prescription prescription1 = new Prescription();
        prescription1.addMedications("Paracetamol");
        prescription1.addDosages("2 times");
        prescription1.addSchedules("Daily");
        doctor1.giveFeedback(patient1, "Take meds and rest", prescription1);

        System.out.println("\nFeedback Records:");
        for (Feedback fb : patient1.getMedicalHistory().getFeedbackRecords()) {
            System.out.println(fb);
        }

        // VITAL SIGNS:
        VitalSign vital1 = new VitalSign(130, 39.5, 85.0, 190);
        patient1.uploadVitals(vital1);

        System.out.println("\nPatient Vitals:");
        for (VitalSign vs : patient1.getVitals().getVitals()) {
            System.out.println(vs);
        }

        //NOTIFICATION SETUP:
        NotificationService ns = new NotificationService();
        ns.addChannel(new EmailNotification());
        ns.addChannel(new SMSNotification());

        // EMERGENCY ALERT:
        EmergencyAlert alert = new EmergencyAlert(ns);
        alert.evaluate(patient1);

        // PANIC BUTTON:
        System.out.println("\n== PANIC BUTTON TRIGGERED ==");
        PanicButton panic = new PanicButton(patient1, alert);
        panic.press();

        // CHAT:
        System.out.println("\n== CHAT SESSION ==");
        ChatServer chatServer = new ChatServer();
        ChatClient docChat = new ChatClient("Dr. Krabs", chatServer);
        ChatClient patChat = new ChatClient("Patrick", chatServer);

        docChat.sendMessage("Hello Patrick, how are you feeling?");
        patChat.sendMessage("Feeling dizzy and hot.");
        docChat.sendMessage("Take your meds and rest. Call if needed.");

        // VIDEO CALL:
        System.out.println("\n== VIDEO CALL SESSION ==");
        VideoCall.startCall("https://meet.google.com/dummy-link");
    }
}
```
