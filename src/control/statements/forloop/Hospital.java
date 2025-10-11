package control.statements.forloop;

public class Hospital
 {
     public static void main (String[] args) {


         Appointment[] appointments= new Appointment[3];
         appointments[0]=new Appointment ("sandhya","08:00AM");
         appointments[1]=new Appointment ("raj","09:00AM");
         appointments[2]=new Appointment ("karan","10:00AM");


         Doctor doctor= new Doctor ("Dr.Mahajan",appointments);
         //System.out.println ("doctor:"+doctor.getAppointments ()[0]);

         System.out.println ("appointments for doctor:"+doctor.getName ()+":");
         for (int i=0;i<doctor.getAppointments ().length;i++){

             Appointment appointment= doctor.getAppointments()[i];

             System.out.println ("Patient:"+appointment.getPatientName ()+" "+"time:"+appointment.getTime ());
         }

         Appointment[] appointments1= new Appointment[3];
         appointments1[0]=new Appointment ("a","08:00AM");
         appointments1[1]=new Appointment ("b","09:00AM");
         appointments1[2]=new Appointment ("c","10:00AM");

         System.out.println ("==========================================");
         Doctor doctor1= new Doctor ("Dr.Joshi",appointments1);
         //System.out.println ("doctor:"+doctor.getAppointments ()[0]);

         System.out.println ("appointments for doctor:"+doctor1.getName ()+":");
         for (int i=0;i<doctor1.getAppointments ().length;i++){

             Appointment appointment1= doctor1.getAppointments()[i];

             System.out.println ("Patient:"+appointment1.getPatientName ()+" "+"time:"+appointment1.getTime ());
         }

         System.out.println ("===============================================================");

         Appointment[] appointments2= new Appointment[3];
         appointments2[0]=new Appointment ("vikash","08:00AM");
         appointments2[1]=new Appointment ("avinash","09:00AM");
         appointments2[2]=new Appointment ("vishal","10:00AM");


         Doctor doctor2= new Doctor ("Dr.Kulkarni",appointments2);
         //System.out.println ("doctor:"+doctor.getAppointments ()[0]);

         System.out.println ("appointments for doctor:"+doctor2.getName ()+":");
         for (int i=0;i<doctor2.getAppointments ().length;i++){

             Appointment appointment2= doctor2.getAppointments()[i];

             System.out.println ("Patient:"+appointment2.getPatientName ()+" "+"time:"+appointment2.getTime ());
         }

     }
}
