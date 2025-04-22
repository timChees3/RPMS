import java.util.ArrayList;

public class MedicalHistory
{
    // Instance Variables:
    private ArrayList<Feedback> feedbackRecords;

    // Constructor:
    public MedicalHistory()
    {
        feedbackRecords = new ArrayList<>();
    }

    // Add Record:
    public void addFeedback(Feedback feedback)
    {
        feedbackRecords.add(feedback);
    }

    // Get History:
    public ArrayList<Feedback> getFeedbackRecords()
    {
        return feedbackRecords;
    }
}
