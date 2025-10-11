package com.multihreading.syncronisation;

public class ATM {

    private Object atmLock = new Object ();
    private Object atmLock1 = new Object ();

    public void useAtm (String user) {

        synchronized (atmLock) {
            System.out.println (user + "   is using ATM");
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
                e.getMessage ();
            }
            synchronized (atmLock1) {
                System.out.println ("finished using ATM");
            }
        }

    }

    public static void main (String[] args) {
        ATM atm = new ATM ();
        Thread t1 = new Thread (() -> atm.useAtm ("sandhya"), "Thread-1");
        Thread t2 = new Thread (() -> atm.useAtm ("Vishal"), "Thread-2");
        t1.start ();
        t2.start ();

    }

}
