package com.multihreading.syncronisation;

public class Demo {
    static int count=0;

    public static void main (String[] args) {
        increment ();
    }
    static  void increment(){
        count++;
        System.out.println (count);
    }
}
