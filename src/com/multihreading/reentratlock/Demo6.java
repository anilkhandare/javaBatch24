package com.multihreading.reentratlock;

import java.util.concurrent.locks.ReentrantLock;

public class Demo6 {
    ReentrantLock reentrantLock= new ReentrantLock ();
    private  final Demo5 demo5= new Demo5 ();
    void  outerMethod(){
        reentrantLock.lock ();
       // demo5.lock ();
        try {
            System.out.println (Thread.currentThread ().getName ());
            innerMethod ();

        }finally {
            reentrantLock.unlock ();
           // demo5.unlock ();
        }

    }
    void  innerMethod(){
        reentrantLock.lock ();
        //demo5.lock ();
        try {
            System.out.println (Thread.currentThread ().getName ());
        }finally {
            reentrantLock.unlock ();
            
            //demo5.unlock ();
        }

    }

    public static void main (String[] args) {
        Demo6 demo6= new Demo6 ();
        demo6.innerMethod ();
    }
}
