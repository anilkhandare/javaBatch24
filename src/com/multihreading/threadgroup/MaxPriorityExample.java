package com.multihreading.threadgroup;

public class MaxPriorityExample extends Thread {

    public MaxPriorityExample (String name, ThreadGroup group) {
        super (group, name);
    }

    @Override
    public void run () {
        for (int i = 1; i < 10; i++) {
            i++;
        }
        System.out.println (Thread.currentThread ().getName ()+"thread execution completed");
    }

    public static void main (String[] args) {
        ThreadGroup tg= new ThreadGroup ("main thread group");

        System.out.println ("maximum priority of the thread group of parent:"+Thread.currentThread ().getName ()+" "+tg.getMaxPriority ());
        ThreadGroup tg1= new ThreadGroup (tg,"child thread group");

        System.out.println ("maximum priority of the thread group of child:"+Thread.currentThread ().getName ()+" "+tg.getMaxPriority ());
        System.out.println (tg.getParent ().getName ());
        System.out.println (tg1.getParent ().getName ());
        System.out.println ();
        MaxPriorityExample t1= new MaxPriorityExample ("Trhead-1",tg);
        MaxPriorityExample t2= new MaxPriorityExample ("Trhead-2",tg1);
        System.out.println (t1.getThreadGroup ().getName ());
        System.out.println (t2.getThreadGroup ().getName ());

        t1.start ();
        t2.start ();

    }
}

