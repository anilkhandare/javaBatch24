package com.arrays.methods;

import java.util.Arrays;

public class DeepHashCOde {
    public static void main (String[] args) {
       int a[]={10,20,30,40,50,60,70};
//        int a2[]={10,20,80,40,50,60,70};


        Object obj1[]={new String[]{"A","B"}};
        Object obj2[]={new String[]{"A","B"}};
        Object obj3[]={"hello",new Object[]{"hi",new String[]{"A","B"}}};
        System.out.println (Arrays.deepToString (obj3));
        System.out.println (Arrays.toString (a));
        System.out.println (Arrays.deepToString (obj1));
        System.out.println ("hashcode obj1:"+ Arrays.hashCode (obj1));
        System.out.println ("hashcode obj2:"+ Arrays.hashCode (obj2));

        System.out.println ("deep hashcode obj1:"+Arrays.deepHashCode (obj1));

        System.out.println ("deep hashcode obj2:"+Arrays.deepHashCode (obj2));

    }
}
