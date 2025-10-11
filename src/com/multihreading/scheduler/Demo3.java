package com.multihreading.scheduler;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo3 {
    public static void main (String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool (1);
        Runnable task = () -> {
            System.out.println ("Task Executed at: " + LocalTime.now ());

        };

        LocalTime targetTime = LocalTime.of (21, 6);
        LocalDateTime now = LocalDateTime.now ();
        LocalDateTime nextRun = now.withHour (targetTime.getHour ())
                .withMinute (targetTime.getMinute ())
                .withSecond (0)
                .withNano (0);
        if (now.compareTo (nextRun) > 0) {
            nextRun = nextRun.plusDays (1);
        }
        long initailDelay = Duration.between (now, nextRun).getSeconds ();
        long period= TimeUnit.DAYS.toSeconds (1);


        scheduledExecutorService.scheduleAtFixedRate (task, initailDelay, period, TimeUnit.SECONDS);
        scheduledExecutorService.schedule (() -> {
            System.out.println ("shutdown task");
            scheduledExecutorService.shutdown ();

        }, 2, TimeUnit.DAYS);

    }
}
