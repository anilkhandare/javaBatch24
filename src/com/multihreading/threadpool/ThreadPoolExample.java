package com.multihreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main (String[] args) {
        //ExecutorService executorService= Executors.newFixedThreadPool (3);
       // ExecutorService executorService=Executors.newSingleThreadExecutor ();
       // ExecutorService executorService=Executors.newCachedThreadPool ();
        ExecutorService executorService=Executors.newScheduledThreadPool (3);

        for (int i=0;i<10;i++){
            Runnable task= new WorkerThread ("Task"+i);
            executorService.execute (task);
        }
        executorService.shutdown ();


    }
}
