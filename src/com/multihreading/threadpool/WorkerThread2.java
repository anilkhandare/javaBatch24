package com.multihreading.threadpool;

public class WorkerThread2 implements  Runnable{

    String notification;

    public WorkerThread2 (String notification) {
        this.notification = notification;
    }

    @Override
    public void run () {
        System.out.println ("thread name:"+Thread.currentThread ().getName ()+" sent notification"+notification);
        try {
            notification();
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }
        System.out.println ("thread name:"+Thread.currentThread ().getName ()+" received notification"+notification);
    }
    void notification() throws InterruptedException {
        Thread.sleep (1000);
    }
}
