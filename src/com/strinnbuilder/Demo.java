package com.strinnbuilder;

public class Demo {
    public static void main (String[] args) {
        StringBuilder sb= new StringBuilder ();
        System.out.println ("capacity:"+sb.capacity ());
        sb.append ("Sandhya");
        sb.append ("Jadhav");
        sb.append ("vishal");
        System.out.println ("sb:"+sb);
        System.out.println (sb.capacity ());
        System.out.println (sb.length ());


    }
}
