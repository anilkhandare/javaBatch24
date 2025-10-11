package com.recursion;

public class Demo1 {
    static void run(){
        System.out.println ("run method");
        run ();
    }
    public static void main (String[] args) {
        run ();
    }
}
