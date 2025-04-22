public class Appointment
{
    // Instance Variables:
    private String date;
    private String time;
    private Patient patient;
    private Doctor doctor;
    private AppointmentStatus status;

    // Constructor:
    public Appointment(String date, String time, Patient patient, Doctor doctor)
    {
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
        this.status = AppointmentStatus.REQUESTED;
    }

    // Getter and Setter for date:
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getter and Setter for time:
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Getter and Setter for patient:
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Getter and Setter for doctor:
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    // Getter and Setter for status:
    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    // toString() method:

    @Override
    public String toString() {
        return "Appointment:\n" +
                "Date: " + date +
                "\nTime: " + time +
                "\nPatient: " + patient +
                "\nDoctor: " + doctor +
                "\nStatus: " + status;
    }
}

// Custom Enum for AppointmentStatus:
enum AppointmentStatus
{
    REQUESTED,
    APPROVED,
    CANCELLED;
}