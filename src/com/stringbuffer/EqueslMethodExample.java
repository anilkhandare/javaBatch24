package com.stringbuffer;

public class EqueslMethodExample {
    public static void main (String[] args) {
        StringBuffer  stringBuffer= new StringBuffer ("vishal");
        StringBuffer  stringBuffer1= new StringBuffer ("vishal");
        System.out.println (stringBuffer.equals (stringBuffer1));
        System.out.println (stringBuffer.toString ().equals (stringBuffer1.toString ()));

    }
}
