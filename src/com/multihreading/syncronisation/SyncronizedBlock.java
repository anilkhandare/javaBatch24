package com.multihreading.syncronisation;

public class SyncronizedBlock {

    void displayMsg(String msg){

        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println ("msg:" + msg + " " + i);
            }
        }
     }

    public static void main (String[] args) {
        SyncronizedBlock syncronizedBlock= new SyncronizedBlock ();
        Thread t1= new Thread (()->syncronizedBlock.displayMsg ("hi"),"thread-1");
        /*Thread t2= new Thread (()->syncronizedBlock.displayMsg ("helo"),"thread-2");
        Thread t3= new Thread (()->syncronizedBlock.displayMsg ("bye"),"thread-3");
        Thread t4= new Thread (()->syncronizedBlock.displayMsg ("tata"),"thread-4");*/
        t1.start ();
  /*      t2.start ();
        t3.start ();
        t4.start ();*/
    }
}
