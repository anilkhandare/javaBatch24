package com.arrays.methods;

import java.util.Arrays;

public class BinarySearch {
    public static void main (String[] args) {
        int i[]={1,6,11,2,9,0,10};
        System.out.println (i.length);
        Arrays.sort (i);
        System.out.println (Arrays.toString (i));
        int key=7;
       int index= Arrays.binarySearch (i,key);

       int index1=Arrays.binarySearch (i,1,3,key);

        System.out.println ("key:"+key+"index:"+index);
        System.out.println ("key:"+key+"index1:"+index1);

        /* return index= -inserstion point(7)-1=-result(8)
        return = - isertion point-1=-result*/
    }
}
