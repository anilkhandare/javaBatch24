package com.strinnbuilder;

public class ReplceExample {
    public static void main (String[] args) {
        StringBuilder stringBuilder= new StringBuilder ("Java Classes by TechM");
        stringBuilder.replace (3,9,"abcdef");
        System.out.println ("after replace :"+stringBuilder);
    }
}
