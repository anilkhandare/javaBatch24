package com.multihreading.reentratlock;

public class Demo {

    synchronized static void a () {
        System.out.println ("in a");
        b ();
    }

    synchronized  static void b () {
        System.out.println ("in b");
    }

    public static void main (String[] args) {
        a ();
    }
}
