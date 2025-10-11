package com.multihreading.threadgroup;

public class EnumerateExample extends Thread {

    public EnumerateExample (String name, ThreadGroup tg) {
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

        EnumerateExample t1= new EnumerateExample ("thread-1",mainThreadGroup);
        EnumerateExample t2= new EnumerateExample ("thread-2",mainThreadGroup);
        t1.start ();
        t2.start ();

       Thread[] tarray=new Thread[mainThreadGroup.activeCount ()];
       int count=mainThreadGroup.enumerate (tarray);
        System.out.println ("active thread: "+count);
       for (int i=0;i<count;i++){
           System.out.println (tarray[i].getName ()+"identify");
       }



    }
}
