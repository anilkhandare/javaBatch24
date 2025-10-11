package com.multihreading.reentratlock;

public class Demo5 {
    private  boolean isLocked=false;
    public  synchronized  void lock(){

        System.out.println ("locked method");

        while (isLocked){
           try {
               wait ();
           }catch (InterruptedException e){
               e.getMessage ();
           }
           isLocked=true;
        }

    }

    public synchronized void unlock(){
        isLocked=false;
        notify ();
    }

    public static void main (String[] args) {
        Demo5 demo5= new Demo5 ();
        demo5.lock ();



    }

}
