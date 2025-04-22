import java.util.ArrayList;

public class VitalsDatabase
{
    // Instance Variables:
    private ArrayList<VitalSign> vitalSigns;

    // Constructor:
    public VitalsDatabase()
    {
        vitalSigns = new ArrayList<VitalSign>();
    }

    // Add Vitals:
    public void addVitals(VitalSign vital)
    {
        vitalSigns.add(vital);
        System.out.println("Vitals Added!");
    }

    // Retrieve Vitals:
    public ArrayList<VitalSign> getVitals()
    {
        return vitalSigns;
    }

    // Retrieve Latest Vitals:
    public VitalSign getLatestVitals() {
        if (!vitalSigns.isEmpty())
        {
            return vitalSigns.get(vitalSigns.size() - 1);
        } else
        {
            return null;
        }
    }


}
