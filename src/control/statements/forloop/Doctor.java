package control.statements.forloop;

public class Doctor {
    private  String name;

    private  Appointment[] appointments;

    public Doctor (String name, Appointment[] appointments) {
        this.name = name;
        this.appointments = appointments;
    }

    public String getName () {
        return name;
    }

    public Appointment[] getAppointments () {
        return appointments;
    }
}
