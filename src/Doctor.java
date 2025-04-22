import java.util.ArrayList;

public class Doctor extends User
{
    // Instance Variables:
    private ArrayList<Patient> patients;
    private ArrayList<Appointment> appointments;

    // Constructor:
    public Doctor(String fName, String lName, String email, String phoneNumber, char gender, int age, String address)
    {
        super(fName, lName, email, phoneNumber, gender, age, address);
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    // Add Patient:
    public void addPatient(Patient patient)
    {
        if (!patients.contains(patient))
        {
            patients.add(patient);
        }
    }

    // Get Patients:
    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    // View Patients Vitals:
    public void viewPatientVitals(Patient patient)
    {
        if(patient.getVitals().getVitals().isEmpty())
        {
            System.out.println("No vitals for patient found");
        }
        else
        {
            System.out.println("Vitals for: " + patient.getFName() + " " + patient.getLName() + " :");
            for (VitalSign vital : patient.getVitals().getVitals())
            {
                System.out.println(vital);
                System.out.println("-----------------------------");
            }
        }
    }

    // Give Feedback:
    public void giveFeedback(Patient patient, String feedbackContent, Prescription prescription)
    {
        Feedback temp = new Feedback(this.getFName() + " " + this.getLName(), feedbackContent, prescription);
        patient.getMedicalHistory().addFeedback(temp);
    }

    // Add Appointments:
    public void addAppointment(Appointment appointment)
    {
        if (!appointments.contains(appointment))
        {
            appointments.add(appointment);
        }
    }

    // Get Appointments:
    public ArrayList<Appointment> getAppointments()
    {
        return appointments;
    }

}
