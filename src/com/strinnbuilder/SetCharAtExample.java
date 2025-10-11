package com.strinnbuilder;

public class SetCharAtExample {
    public static void main (String[] args) {
        StringBuilder stringBuilder= new StringBuilder ("Raj");
        System.out.println ("======get char at using provided index");
        System.out.println (stringBuilder.charAt (0));
        stringBuilder.setCharAt (1,'R');
        System.out.println ("after set the charchter at index value:"+stringBuilder);


    }

}
