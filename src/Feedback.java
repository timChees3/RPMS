public class Feedback
{
    // Instance Variables:
    private String doctorName;
    private String feedbackContent;
    private Prescription prescription;

    // Constructor:
    public Feedback(String doctorName, String feedbackContent, Prescription prescription)
    {
        this.doctorName = doctorName;
        this.feedbackContent = feedbackContent;
        this.prescription = prescription;
    }

    // Getter and Setter for doctorName:
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    // Getter and Setter for feedbackContent
    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    // Getter and Setter for prescription:
    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    // toString() Method:

    @Override
    public String toString() {
        return "Feedback: \n" +
                "Doctor Name: " + doctorName +
                "\nFeedback: " + feedbackContent +
                "\n" + prescription;
    }
}
