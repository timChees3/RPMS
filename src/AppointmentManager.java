import java.util.ArrayList;

public class AppointmentManager
{
    // Instance Variables:
    private ArrayList<Appointment> appointments;

    // Constructor:
    public AppointmentManager()
    {
        appointments = new ArrayList<>();
    }

    // Request Appointment:
    public void requestAppointment(Appointment appointment)
    {
        appointments.add(appointment);
        System.out.println("Appointment Requested!");
    }

    // Approve Appointment:
    public void approveAppointment(Appointment appointment)
    {
        appointment.setStatus(AppointmentStatus.APPROVED);
        System.out.println("Appointment Approved!");
    }

    // Cancel Appointment:
    public void cancelAppointment(Appointment appointment)
    {
        appointment.setStatus(AppointmentStatus.CANCELLED);
        System.out.println("Appointment Cancelled!");
    }

    // Returning Appointments:
    public ArrayList<Appointment> getAppointments()
    {
        return appointments;
    }
}
