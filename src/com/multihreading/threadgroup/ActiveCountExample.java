package com.multihreading.threadgroup;

public class ActiveCountExample extends Thread {

    public ActiveCountExample (String name, ThreadGroup tg) {
        super (tg, name);
    }

    @Override
    public void run () {
        for (int i = 0; i < 10; i++) {
            try {
                sleep (30);
            } catch (InterruptedException e) {
                System.out.println (Thread.currentThread ().getName () + "interrupted");
            }

        }
        System.out.println (Thread.currentThread ().getName () + "completed execution");
    }

    public static void main (String[] args) {
        ThreadGroup threadGroup = new ThreadGroup ("parent thread group");
        ActiveCountExample t1 = new ActiveCountExample ("thread-1", threadGroup);
        ActiveCountExample t2 = new ActiveCountExample ("thread-2", threadGroup);
        ActiveCountExample t3 = new ActiveCountExample ("thread-3", threadGroup);
        t1.start ();
        t2.start ();
        System.out.println ("number of active thread:"+threadGroup.activeCount ());
        t3.start ();


    }
}
