package com.arrays.methods;

import java.util.Arrays;

public class CopyOfRange {
    public static void main (String[] args) {
        int a[]={10,20,30,40,50,60,70};
        int copy1[]= Arrays.copyOfRange (a,1,4);
        System.out.println ("copy1 array elements:"+Arrays.toString (copy1));


    }
}
