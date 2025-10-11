package com.multihreading.reentratlock;

public class Demo3 {
    int count=2;
    public  int increment(){

        return ++count;

    }

    public static void main (String[] args) {
        System.out.println (new Demo3 ().increment ());
        System.out.println (new Demo3 ().increment ());
    }

}
