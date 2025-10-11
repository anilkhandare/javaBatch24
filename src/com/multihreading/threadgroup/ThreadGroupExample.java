package com.multihreading.threadgroup;

public class ThreadGroupExample {
    public static void main (String[] args) throws InterruptedException {
        ThreadGroup clinentThreadGroup= new ThreadGroup ("clientHandler");
        Runnable task=()->{
            try {
                while (!Thread.currentThread ().isInterrupted ()) {
                    System.out.println ("name of the thread:" + Thread.currentThread ().getName () + "handling client..");
                    Thread.sleep (2000);
                }
            }catch (InterruptedException e){
                System.out.println (Thread.currentThread ().getName ()+"thread is intrupted closing connection... ");
            }
        };
        for(int i=1;i<5;i++){
           Thread t= new Thread (clinentThreadGroup,task,"client-");
           t.setDaemon (true);
           t.start ();
        }
        Thread.sleep (1000);
        System.out.println ("shutting down all the threads");
        //clinentThreadGroup.interrupt ();
    }
}
