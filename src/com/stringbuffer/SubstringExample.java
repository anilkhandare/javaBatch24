package com.stringbuffer;

public class SubstringExample {
    public static void main (String[] args) {
        StringBuffer stringBuffer= new StringBuffer ("java class");
        System.out.println (stringBuffer.length ());
        System.out.println (stringBuffer.substring (2));
        System.out.println (stringBuffer.substring (4,stringBuffer.length ()));
    }


}
