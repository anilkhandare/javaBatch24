package com.multihreading.threadgroup;


import java.awt.*;

public class listExample extends Thread {

    public listExample (String name, ThreadGroup group) {
        super (group, name);
    }

    @Override
    public void run () {
        for (int i = 1; i < 10; i++) {
            try {
                sleep (2000);
            } catch (InterruptedException e) {
                throw new RuntimeException (e);
            }
        }
        System.out.println (Thread.currentThread ().getName () + "thread execution completed");
    }

    public static void main (String[] args) {

        ThreadGroup tg = new ThreadGroup ("main thread group");
        ThreadGroup tg1 = new ThreadGroup (tg, "child thread group");

        boolean isParent = tg.parentOf (tg);
        boolean isParent1 = tg1.parentOf (tg1);
        System.out.println (isParent);
        System.out.println (isParent1);


        listExample t1 = new listExample ("Trhead-1", tg);
        t1.start ();
        tg.suspend ();

        listExample t2 = new listExample ("Trhead-2", tg1);
        t2.start ();
        tg.resume ();

        tg.list ();

    }
}

