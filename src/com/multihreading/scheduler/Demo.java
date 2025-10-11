package com.multihreading.scheduler;

import sun.management.counter.Units;

import java.time.Instant;
import java.time.LocalTime;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main (String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool (1);
        Runnable task=()->{
            System.out.println ("Task Executed at: "+ LocalTime.now ());

        };
        scheduledExecutorService.scheduleAtFixedRate (task,31,5, TimeUnit.SECONDS)   ;
        scheduledExecutorService.schedule (()->{
            System.out.println ("shutdown task");
            scheduledExecutorService.shutdown ();

        },30,TimeUnit.SECONDS);

    }
}
