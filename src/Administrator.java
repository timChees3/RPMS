import java.util.ArrayList;

public class Administrator extends User
{
    // Instance Variables:
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;

    // Constructor:
    public Administrator(String fName, String lName, String email, String phoneNumber, char gender, int age, String address)
    {
        super(fName, lName, email, phoneNumber, gender, age, address);
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    // Add Patient:
    public void addPatient(Patient patient)
    {
        this.patients.add(patient);
    }

    // Get Patients:
    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    // Remove Patient:
    public void removePatient(Patient patient)
    {
        this.patients.remove(patient);
    }

    // Add Doctor:
    public void addDoctor(Doctor doctor)
    {
        this.doctors.add(doctor);
    }

    // Get Doctors:
    public ArrayList<Doctor> getDoctors()
    {
        return doctors;
    }

    // Remove Doctors:
    public void removeDoctor(Doctor doctor)
    {
        this.doctors.remove(doctor);
    }
}
