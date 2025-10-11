package com.strinnbuilder;

public class EqueslMethodExample {
    public static void main (String[] args) {
        StringBuilder  stringBuilder= new StringBuilder ("vishal");
        StringBuilder  stringBuilder1= new StringBuilder ("vishal");
        System.out.println (stringBuilder.equals (stringBuilder1));
        System.out.println (stringBuilder.toString ().equals (stringBuilder1.toString ()));

    }
}