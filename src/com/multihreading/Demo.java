package com.multihreading;


public class Demo extends Thread{

    public void run () {
        for (int i=1;i<=5;i++) {
            System.out.println ("child thread: "+i);
            try {
                sleep (1000);

               /* System.out.println ("currentThread():"+Thread.currentThread ());
                System.out.println ("activeCount():"+Thread.activeCount ());*/
                //Thread.yield ();


            } catch (InterruptedException e) {
                throw new RuntimeException (e);
            }
            System.out.println ("threadName: "+Thread.currentThread ()+"Finished");

        }
    }

    public static void main (String[] args) throws InterruptedException {
        Demo demo= new Demo ();
        Demo demo1= new Demo ();
        Demo demo2= new Demo ();
        Demo demo3= new Demo ();
       // demo.run();
        Thread t= new Thread (demo);
        Thread t1= new Thread (demo1);
        Thread t2= new Thread (demo2);
        Thread t3= new Thread (demo3);
        t.join ();
        t.join ();
        //t.destroy ();
        t.start ();
        t1.start ();
        t2.start ();
        t3.start ();
        t3.start ();

        t.join ();
        t1.join ();
        t2.join ();
        t3.join ();

   /*     t.setName ("proces1-1");
        t1.setName ("mySecondThread-2");
        System.out.println ("thread name:"+t.getName ());
        System.out.println ("threadName 2:"+t1.getName ());
        System.out.println ("id :"+t.getId ());
        System.out.println ("id:"+t1.getId ());*/
        t.suspend ();
        //t.destroy ();
        t.stop ();
        t.resume ();





    }
}
