package com.multihreading.threadpool;

import static java.lang.Thread.sleep;

public class WorkerThread implements Runnable{
    private  String taskName;

    public WorkerThread (String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run () {
        System.out.println (Thread.currentThread ().getName ()+" is executing "+taskName);
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }
        System.out.println (taskName+" completed by "+Thread.currentThread ().getName ());
    }
}
