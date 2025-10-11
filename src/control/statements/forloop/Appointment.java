package control.statements.forloop;

public class Appointment {
 private String patientName;
 private String time;

    public Appointment ( String patientName,String time) {
        this.time = time;
        this.patientName = patientName;
    }

    public String getTime () {
        return time;
    }

    public void setTime (String time) {
        this.time = time;
    }

    public String getPatientName () {
        return patientName;
    }

    public void setPatientName (String patientName) {
        this.patientName = patientName;
    }
}
