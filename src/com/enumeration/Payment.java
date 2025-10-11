package com.enumeration;

public class Payment {
    int paymentId;
    double amount;
    PaymentStatus status;

    public Payment (int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
    }
    public  void paymentSuccess(){
        this.status=PaymentStatus.SUCCESS;
    }
    public void failedPayment(){
        this.status=PaymentStatus.FAILURE;
    }
    public void inProgressPayment(){
        this.status=PaymentStatus.INPROGRESS;
    }
    void printStatus(){
        System.out.println ("Payment ID: " +paymentId);
        System.out.println ("Amount: "+amount);
        System.out.println ("Status: "+status+ " "+ status.getDESCRIPTION ());
        System.out.println ("====================================================");
    }

    public static void main (String[] args) {

        Payment customer1= new Payment (4335,3000.0);
        Payment customer2= new Payment (43434,4000.0);
        Payment customer3= new Payment (223423,3500);

        customer1.printStatus ();
        customer2.printStatus ();
        customer3.printStatus ();

        customer1.paymentSuccess ();
        customer3.failedPayment ();
        customer2.inProgressPayment ();

        customer1.printStatus ();
        customer2.printStatus ();
        customer3.printStatus ();

    }
}
