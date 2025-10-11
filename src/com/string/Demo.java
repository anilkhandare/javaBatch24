package com.string;

import java.util.Hashtable;

public class Demo {
    public static void main (String[] args) {
        char[] ch={'s','b'};
        String s="java is the best programming ";
        s="sandhya";
        String s2= new String ("java");
        System.out.println (s2);

        System.out.println (s);
        Hashtable<String,Integer> ht= new Hashtable<> ();// a=1,b=2,c=3

        String key1="a";
        ht.put (key1,1);
        ht.put ("b",2);
        ht.put ("c",3);
        key1.toUpperCase ();//A
        String key2=key1.toUpperCase ();
        System.out.println ("key2:"+key2);
        System.out.println ("key:"+key1);
        System.out.println ("ht:"+ht);
        Object obj=ht.get ("a");
        Object obj1=ht.get (key1);
        Object obj2=ht.get (key2);
        System.out.println ("object:"+obj2);

        System.out.println (obj);
        System.out.println (obj1);




    }
}
