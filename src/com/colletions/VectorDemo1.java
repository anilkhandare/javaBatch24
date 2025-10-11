package com.colletions;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo1 {
    public static void main (String[] args) {
        Vector<String> stringVector= new Vector<> ();
        stringVector.add ("Vishal");
        stringVector.add ("sandhya");
        stringVector.add ("anil");
        stringVector.add ("Vishal");
        stringVector.add ("sandhya");
        stringVector.add ("anil");
        System.out.println (stringVector);
        stringVector.remove ("Vishal");
        System.out.println (stringVector);
        System.out.println (stringVector.indexOf ("Vishal"));
        System.out.println ("==================================");
        stringVector.add (1,"abc");
        stringVector.addElement ("xyz");
        Object clonevector=stringVector.clone ();
        System.out.println ("first elements:"+stringVector.firstElement ());
        System.out.println ("get method call: "+stringVector.get (1));




        Enumeration<String> enumeration= stringVector.elements ();

        while (enumeration.hasMoreElements ()){
            System.out.println (enumeration.nextElement ());
            //stringVector.add ("anil");
        }

        ListIterator<String> listIterator=stringVector.listIterator ();
        while(listIterator.hasNext()){
            System.out.println (listIterator.next());
        }

        Iterator<String> iterator= stringVector.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }



    }
}
