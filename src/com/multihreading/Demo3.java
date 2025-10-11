package com.multihreading;

public class Demo3 extends Thread {

    @Override
    public  void run(){
        System.out.println ("child thread");
    }
    public static void main (String[] args) {
      Demo3 demo3= new Demo3 ();
      //Thread t= new Thread (demo3);
        demo3.start ();
        demo3.start ();
    }
}
