package com.multihreading.syncronisation;

public class BankAcount {
    private  double balance=1000;

    public  synchronized void  withdrawal(double amount) {


        if(balance>=amount){

            System.out.println (Thread.currentThread ().getName ()+" withdraw-"  +amount);
            balance-=amount;
            System.out.println ("remaining balance: "+balance);
        }else
            System.out.println ("insufficient balance: "+Thread.currentThread ().getName ());
    }

    public static void main (String[] args) {
        BankAcount bankAcount= new BankAcount ();
        Thread t1= new Thread (()->bankAcount.withdrawal (700),"thread-1");
        Thread t2= new Thread (()->bankAcount.withdrawal (700),"thread-2");
        Thread t3= new Thread (()->bankAcount.withdrawal (700),"thread-3");
        Thread t4= new Thread (()->bankAcount.withdrawal (700),"thread-4");
        t1.start ();
        t2.start ();
        t3.start ();
        t4.start ();


    }
}
