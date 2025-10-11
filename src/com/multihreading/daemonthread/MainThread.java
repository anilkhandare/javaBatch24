package com.multihreading.daemonthread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class MainThread {
    public static void main (String[] args) throws InterruptedException {
        SessionManager sessionManager= new SessionManager ();
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool (1);
        scheduledExecutorService.scheduleAtFixedRate (new SessionCleanupTask(sessionManager),0,5, TimeUnit.SECONDS);
        sessionManager.addNewSession ("user1");
        sessionManager.addNewSession ("user2");
        System.out.println ("Main thread is running .....");
        sleep (2000);
        System.out.println ("main thread application shutting down");
        //scheduledExecutorService.shutdown ();
        try{
            if(!scheduledExecutorService.awaitTermination (5,TimeUnit.SECONDS)){
                scheduledExecutorService.shutdownNow ();
            }
        }catch (Exception e){
            scheduledExecutorService.shutdownNow ();
        }
    }
}
