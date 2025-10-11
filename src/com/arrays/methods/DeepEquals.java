package com.arrays.methods;

import java.util.Arrays;

public class DeepEquals {
    public static void main (String[] args) {
        int a[]={10,20,30,40,50,60,70};
        int a2[]={10,20,80,40,50,60,70};
        System.out.println ("ref normal  comparison:"+ Arrays.equals (a,a2));

        Object obj1[]={new String[]{"A","B"}};
        Object obj2[]={new String[]{"A","B","C"}};
        System.out.println ("deep comparison :"+Arrays.deepEquals (obj1,obj2));

    }
}
