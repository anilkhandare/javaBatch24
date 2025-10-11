package com.multihreading.daemonthread;

public class DaemonThread extends  Thread{

    @Override
    public void run () {
      if(Thread.currentThread ().isDaemon ()){
          System.out.println ("thread name:"+getName ()+"is demon thread");
      }else
          System.out.println (getName ()+"is user thread");
    }

    public static void main (String[] args) {
        DaemonThread thread1= new DaemonThread ();
        DaemonThread thread2= new DaemonThread ();

        thread1.setDaemon (true);
        thread1.start ();
        thread2.start ();


    }
}
