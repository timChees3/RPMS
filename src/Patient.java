import java.util.ArrayList;

public class Patient extends User
{
    // Instance Variables:
    private VitalsDatabase vitals;
    private ArrayList<Appointment> appointments;
    private MedicalHistory medicalHistory;

    // Constructor:
    public Patient(String fName, String lName, String email, String phoneNumber, char gender, int age, String address)
    {
        super(fName, lName, email, phoneNumber, gender, age, address);
        this.appointments = new ArrayList<>();
        this.medicalHistory = new MedicalHistory();
        this.vitals = new VitalsDatabase();
    }

    // Upload Vitals:
    public void uploadVitals(VitalSign vital)
    {
        vitals.addVitals(vital);
    }

    // Retrieve Vitals:
    public VitalsDatabase getVitals()
    {
        return vitals;
    }

    // Schedule Appointment:
    public void scheduleAppointment(AppointmentManager manager, Appointment appointment)
    {
        manager.requestAppointment(appointment);
    }

    // Retrieve Appointments:
    public ArrayList<Appointment> getAppointments()
    {
        return appointments;
    }

    public void viewFeedback()
    {
        if(medicalHistory.getFeedbackRecords().isEmpty())
        {
            System.out.println("No feedback records found");
        }
        else
        {
            System.out.println("Feedback Records for " + this.getFName() + " " + this.getLName() + " :");
            for (Feedback feedback : medicalHistory.getFeedbackRecords())
            {
                System.out.println(feedback);
                System.out.println("-----------------------------");
            }
        }
    }

    public MedicalHistory getMedicalHistory()
    {
        return medicalHistory;
    }
}
