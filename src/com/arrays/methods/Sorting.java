package com.arrays.methods;

import java.util.Arrays;

public class Sorting {
    public static void main (String[] args) {
        int i[]={1,6,4,2,9,0};
        Arrays.sort (i);
        System.out.println (Arrays.toString (i));
        Arrays.sort (i,1,4);
        System.out.println (Arrays.toString (i));

    }
}
