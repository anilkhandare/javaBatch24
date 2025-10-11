package com.multihreading.syncronisation;

public class DeadlockAlways {
    private static final Object lock1= new Object ();
    private static final  Object lock2 = new Object ();

    public static void main (String[] args) {

        Thread t1= new Thread (()->
        {
            synchronized (lock1){
                System.out.println ("thread 1 locked lock1");
                System.out.println (Thread.currentThread ().getName ()+"locked:"+lock1);
                try {
                    Thread.sleep (2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException (e);
                }
                synchronized (lock2){
                    System.out.println ("thread 1 locked lock2");
                }
            }
        });

        Thread t2= new Thread (()->
        {
            synchronized (lock1){
                System.out.println ("thread 1 locked lock2");
                System.out.println (Thread.currentThread ().getName ()+"locked:"+lock1);
                try {
                    Thread.sleep (10);
                } catch (InterruptedException e) {
                    throw new RuntimeException (e);
                }
                synchronized (lock2){
                    System.out.println ("thread 2 locked lock1");
                }
            }
        });
        t1.start ();
        t2.start ();
    }


}
