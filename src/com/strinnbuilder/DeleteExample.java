package com.strinnbuilder;

public class DeleteExample {
    public static void main (String[] args) {
        StringBuilder stringBuilder= new StringBuilder ("sandhya");
        stringBuilder.append ("Jadhav");
        System.out.println (stringBuilder);
        stringBuilder.delete (0,7);//remove the substring
        System.out.println ("after delete:"+stringBuilder);
        stringBuilder.deleteCharAt (1);
        System.out.println ("after delete using charAt: "+stringBuilder);
    }
}
