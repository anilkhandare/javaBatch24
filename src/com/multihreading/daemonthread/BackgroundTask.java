package com.multihreading.daemonthread;

public class BackgroundTask extends  Thread{
    @Override
    public void run () {
        while (true){
            System.out.println ("running daemon thread......");
            try {
                sleep (1000);
            } catch (InterruptedException e) {
                throw new RuntimeException (e);
            }
        }
    }

    public static void main (String[] args) throws InterruptedException {
        BackgroundTask thread1= new BackgroundTask ();
        thread1.run ();
        thread1.setDaemon (true);
        thread1.start ();
        System.out.println ("Main Thread Running...");
        sleep (1000);
    }
}
