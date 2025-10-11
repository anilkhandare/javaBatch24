package com.colletions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main (String[] args) {



        List<Integer> list = new ArrayList<> ();
        list.add (1);
        list.add (2);
        list.add (3);
        list.add (1);
        list.add (2);
        list.add (3);


        System.out.println (list);

        List<Integer>  list1= new ArrayList<> ();

        list1.add (1);

        list1.addAll (list);
        System.out.println (list1);
        System.out.println ("after deleting the record of the arraylist [list1]");
        System.out.println (list1.remove (1));

        //System.out.println (list1.remove (1));
        //System.out.println (list1.remove (12));
        System.out.println (list1);
        List<String> stringList= new ArrayList<> ();
        stringList.add ("a");
        stringList.add ("b");
        stringList.add ("a");
        stringList.add ("b");
        System.out.println (stringList);
        System.out.println (stringList.remove ("a"));
        System.out.println (stringList);
        System.out.println (stringList.remove ("x"));
        System.out.println (stringList);
        System.out.println (stringList.get (2));
        //stringList.clear ();
        System.out.println (stringList);
        System.out.println (stringList.contains ("a"));
        System.out.println (stringList.isEmpty ());
        stringList.set (1,"A");
        System.out.println ("after set the element at the index 1");
        System.out.println (stringList);

        //stringList.set (3,"A");

        for(String s:stringList){
            System.out.println (s);
        }









    }
}
