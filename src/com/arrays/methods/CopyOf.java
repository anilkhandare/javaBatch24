package com.arrays.methods;

import java.util.Arrays;

public class CopyOf {
    public static void main (String[] args) {

        int[] a={1,2,3,4};//original array

        int copy1[]= Arrays.copyOf (a,2);//length reduce
        System.out.println ("new length copy1:"+Arrays.toString (copy1));

        int copy2[]= Arrays.copyOf (a,7);// length increased
        System.out.println ("new length copy2:"+Arrays.toString (copy2));

    }
}
