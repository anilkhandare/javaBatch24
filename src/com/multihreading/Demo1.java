package com.multihreading;

public class Demo1 implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run () {
        for (int i=1;i<=10;i++) {
            System.out.println ("thread: "+i);
        }
    }

    public static void main (String[] args) {
        Demo1 demo1= new Demo1 ();
        //demo1.run ();
        Thread t1= new Thread (demo1);
        t1.start ();
    }
}
