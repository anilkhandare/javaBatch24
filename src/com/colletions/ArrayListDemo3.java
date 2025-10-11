package com.colletions;

import java.util.*;

public class ArrayListDemo3 {
    public static void main (String[] args) {
        List<String> stringList = new ArrayList<> ();
        stringList.add ("sandhya");
        stringList.add ("vishal");
        stringList.add ("sandhya");
        stringList.add ("vishal");
        stringList.add ("sandhya");
        stringList.add ("vishal");

        for (String s : stringList) {
            System.out.println (s);
            if (s.equals ("vishal")) {
               // stringList.add ("a");
            }
        }
        System.out.println ("---------------------------------");
        ListIterator<String> listIterator = stringList.listIterator ();
        while (listIterator.hasNext ()) {
            System.out.println (listIterator.next ());
            String name = listIterator.next ();
            if (name.equals ("vishal")) {
                listIterator.set ("anil");
                listIterator.add ("vishal");
            }


        }
        System.out.println ("======================");
        System.out.println (stringList);


        Iterator<String> iterator = stringList.iterator ();
        while (iterator.hasNext ()) {
            System.out.println (iterator.next ());
            //String name = iterator.next ();
        }
        System.out.println ("======================");
        System.out.println (stringList);

        for(int i=0;i<stringList.size ();i++){
            System.out.println (stringList.get (i));
        }

        Enumeration<String> enumeration= (Enumeration<String>) stringList.iterator ();

        while (enumeration.hasMoreElements ()){
            System.out.println (enumeration.nextElement ());
            //stringVector.add ("anil");
        }

    }
}
