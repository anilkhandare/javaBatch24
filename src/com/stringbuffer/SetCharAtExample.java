package com.stringbuffer;

public class SetCharAtExample {
    public static void main (String[] args) {
        StringBuffer stringBuffer= new StringBuffer ("Raj");
        System.out.println ("======get char at using provided index");
        System.out.println (stringBuffer.charAt (2));
        stringBuffer.setCharAt (1,'R');
        System.out.println ("after set the charchter at index value:"+stringBuffer);


    }

}
