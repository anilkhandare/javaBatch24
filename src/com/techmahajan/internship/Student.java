package com.techmahajan.internship;

import keywords.throwandthrows.ThrowsKeyword;

public class Student {
    String s;
    public static void main (String[] args) {

        System.out.println (new Student ().s);
        int year=10;
        assert year >=11 : "u r eligible for graduvity";
        //System.out.println ("not eligible");

        Student s= new Student ();
       // System.out.println (s instanceof ThrowsKeyword);
    }
}
