package com.wraper;

import java.util.ArrayList;


public class Demo2 {
    public static void main (String[] args) {
        Integer a=128;
        Integer b=128;
        System.out.println (a==b);
        System.out.println (a.equals (b));
        int c=new Integer (10);
        Integer.valueOf (10);
        Float f= 10.0f;
        Long l=20l;
        Double d=20.0;
        short sh1=10;
        Short sh= Short.valueOf (sh1);
        Boolean aBoolean=false;//convert Boolean.valueOf(false);
        Byte bytea=1;
        Character character='a';

        ArrayList<Integer> arrayList= new ArrayList<Integer> ();

       // Integer inta=new Integer (); // this is deprecated and removed now
        Integer intb= Integer.valueOf (10);// newly introduced in java 9



    }
}
