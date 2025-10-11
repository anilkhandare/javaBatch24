package com.string.stringarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo1 {
    public static void main (String[] args) {

        String[] str3=new String []{"abc","xyz"};
       String[] str=new String[2];
        String[] str1={"karina","kajol"};
        //str={"anil","raj"};
        str[0]="raj";
        str[1]="ajay";
        //str[2]="vijay";
        System.out.println ("print array:"+ Arrays.toString (str));
        for(String s:str){
            System.out.println (s);
        }
        for (int i=0;i<str3.length;i++){
            System.out.println (str3[i]);
        }

    }
}
