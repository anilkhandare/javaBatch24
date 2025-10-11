package com.stringbuffer;

public class ReplceExample {
    public static void main (String[] args) {
        StringBuffer stringBuffer= new StringBuffer ("Java Classes by TechM");
        stringBuffer.replace (3,9,"abcdef");
        System.out.println ("after replace :"+stringBuffer);
    }
}
