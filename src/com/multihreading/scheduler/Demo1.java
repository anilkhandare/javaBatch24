package com.multihreading.scheduler;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo1 extends Thread {
    @Override
    public void run () {
        System.out.println ("Task Executed at: " + LocalTime.now ());
    }

    public static void main (String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool (1);

        Demo1 demo1 = new Demo1 ();
        Thread t = new Thread (demo1);
        t.start ();

        scheduledExecutorService.scheduleAtFixedRate (t, 5, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule (() -> {
            System.out.println ("shutdown task");
            scheduledExecutorService.shutdown ();

        }, 30, TimeUnit.SECONDS);

    }
}
