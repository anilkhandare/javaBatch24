package com.multihreading.threadgroup;

public class isDaemonExample extends Thread {

    public isDaemonExample (String name, ThreadGroup group) {
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
        System.out.println ("===============");
        //tg.setDaemon (true);
        System.out.println (tg.getName ()+" is a daemon threadgroup: "+tg.isDaemon ());
        System.out.println ("================");

        System.out.println ("maximum priority of the thread group of parent:"+Thread.currentThread ().getName ()+" "+tg.getMaxPriority ());
        ThreadGroup tg1= new ThreadGroup (tg,"child thread group");
        System.out.println ("================");
        tg1.setDaemon (true);
        System.out.println (tg1.getName ()+" is a daemon threadgroup: "+tg1.isDaemon ());
        System.out.println ("================");
        System.out.println (tg.getName ()+" is a daemon threadgroup: "+tg.isDaemon ());

        System.out.println ("maximum priority of the thread group of child:"+Thread.currentThread ().getName ()+" "+tg.getMaxPriority ());
        System.out.println (tg.getParent ().getName ());
        System.out.println (tg1.getParent ().getName ());
        System.out.println ();
        isDaemonExample t1= new isDaemonExample ("Trhead-1",tg);
        isDaemonExample t2= new isDaemonExample ("Trhead-2",tg1);
        System.out.println (t1.getThreadGroup ().getName ());
        System.out.println (t2.getThreadGroup ().getName ());

        tg.stop ();
        tg1.stop();
        t1.stop ();
        t1.start ();
        t2.start ();
        tg.stop ();
        tg1.stop();

    }
}

