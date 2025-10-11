package com.multihreading.threadgroup;

public class ActiveGroupCountExample extends Thread {

    public ActiveGroupCountExample (String name, ThreadGroup tg) {
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

    public static void main (String[] args) throws InterruptedException {

        ThreadGroup mainThreadGroup = new ThreadGroup ("parent thread group");

        ThreadGroup childThreadGroup1 = new ThreadGroup (mainThreadGroup,"child-1 thread group");
        ThreadGroup childThreadGroup2 = new ThreadGroup (mainThreadGroup,"child-2 thread group");

        ActiveGroupCountExample t1= new ActiveGroupCountExample ("thread-1",mainThreadGroup);
        ActiveGroupCountExample t2= new ActiveGroupCountExample ("thread-2",mainThreadGroup);

        System.out.println ("number of active thread:"+mainThreadGroup.activeGroupCount ());
        System.out.println ("number of active thread:"+mainThreadGroup.activeCount ());

        t2.start ();
        System.out.println ("number of active thread:"+mainThreadGroup.activeCount ());
        System.out.println ("number of active thread:"+mainThreadGroup.activeGroupCount ());
        childThreadGroup1.destroy ();
        t1.join ();
        t2.join ();
        childThreadGroup1.destroy ();
        System.out.println (childThreadGroup1.getName ()+"-destroyed");
        mainThreadGroup.destroy ();
        System.out.println (mainThreadGroup.getName ()+"-destroyed");



    }
}
