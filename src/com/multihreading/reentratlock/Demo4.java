package com.multihreading.reentratlock;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo4 {
    private  final AtomicInteger count = new AtomicInteger (0);

    public  int increment(){

        return count.incrementAndGet ();

    }

    public static void main (String[] args) {
        System.out.println (new Demo4 ().increment ());
        System.out.println (new Demo4 ().increment ());
    }

}
