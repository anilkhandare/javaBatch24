package com.stringbuffer;

public class StringBufferImmutable {
    public static void main (String[] args) {
        StringBuffer stringBuffer= new StringBuffer ("Raj");
        String s= stringBuffer.toString ();//immutable string
        System.out.println (s);
        System.out.println (stringBuffer);
        stringBuffer.append ("ajay");
        System.out.println ("===after convert into string===");
        System.out.println ("after immutable string object:"+s);
        System.out.println ("after immutable stringbuffer:"+stringBuffer);
    }


}
