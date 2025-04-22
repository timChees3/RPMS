import java.util.ArrayList;

public class Prescription
{
    // Instance Variable:
    private ArrayList<String> medications;
    private ArrayList<String> dosages;
    private ArrayList<String> schedules;

    //  Constructor:
    public Prescription()
    {
        this.medications = new ArrayList<>();
        this.dosages = new ArrayList<>();
        this.schedules = new ArrayList<>();
    }

    // Getter and Setter for medications:
    public ArrayList<String> getMedications() {
        return medications;
    }

    public void addMedications(String medication) {
        this.medications.add(medication);
    }

    // Getter and Setter for dosages:
    public ArrayList<String> getDosages() {
        return dosages;
    }

    public void addDosages(String dosage) {
        this.dosages.add(dosage);
    }

    // Getter and Setter for schedules:
    public ArrayList<String> getSchedules() {
        return schedules;
    }

    public void addSchedules(String schedule) {
        this.schedules.add(schedule);
    }

    // toString() Method:
    @Override
    public String toString() {
        return "Prescription:\n" +
                "Medications: " + medications +
                "\nDosages: " + dosages +
                "\nSchedules: " + schedules;
    }
}
