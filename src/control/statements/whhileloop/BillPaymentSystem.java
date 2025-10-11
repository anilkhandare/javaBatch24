package control.statements.whhileloop;

import java.util.Random;

public class BillPaymentSystem {


    public static void main (String[] args) {
        int maxretry=3;
        int attempt=0;
        boolean paymentsuccesfull=false;

        while (attempt<maxretry){
            attempt++;
            System.out.println ("attempt:"+attempt);
            if(processPayment ()){
                System.out.println ("Payment Success");
                paymentsuccesfull=true;
                break;
            }else
                System.out.println ("payment failed Retrying.....");
        }
        if (!paymentsuccesfull){
            System.out.println ("Payment failed after 3 attempt please try after sometime");

        }
    }
    public  static  boolean processPayment(){
        Random random= new Random ();
        return random.nextBoolean ();//true or false
        //return false;
    }
}
