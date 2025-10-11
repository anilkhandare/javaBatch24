package com.multihreading;

public class PriorityExample extends Thread {
    @Override
    public void run () {
        System.out.println ("thread Name: "+Thread.currentThread ().getName ()+" Thread Priority:  "+Thread.currentThread ().getPriority ());
        /*for (int i =0; i<10;i++){
            System.out.println ("child thread execution: "+i);
        }*/
    }
    public static void main (String[] args) {
        PriorityExample t1= new PriorityExample ();
        PriorityExample t2= new PriorityExample ();
        PriorityExample t3= new PriorityExample ();
        PriorityExample t4= new PriorityExample ();

        t1.setPriority (Thread.MAX_PRIORITY);//10
        t1.start ();
        t2.setPriority (Thread.MIN_PRIORITY);
        t2.start ();
        t3.setPriority (Thread.MAX_PRIORITY);
        t3.start ();
        t4.start ();
        System.out.println ("main thread:");

    }
}
