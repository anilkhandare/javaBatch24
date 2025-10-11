package com.strinnbuilder;

public class SubstringExample {
    public static void main (String[] args) {
        StringBuilder stringBuilder= new StringBuilder ("java class");
        System.out.println (stringBuilder.length ());
        System.out.println (stringBuilder.substring (2));
        System.out.println (stringBuilder.substring (4,6)); // 4(4-1) starting index, end index 6(0,1,2,3,4,5)

    }


}
