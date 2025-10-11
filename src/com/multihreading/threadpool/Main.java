package com.multihreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main (String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool (5);
        for(int i=1;i<10;i++){
            Runnable worked= new WorkerThread2 (""+i);
            executorService.execute (worked);
        }
        System.out.println ("all threads are executed");
    }
}
