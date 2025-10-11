package com.colletions;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
    public static void main (String[] args) {
        Stack<String> stack= new Stack ();
        stack.push ("abc");
        stack.push ("vishal");
        stack.push ("anil");
        stack.push ("sandhya");
       // System.out.println ("pop the elecents:"+stack.pop ());
        System.out.println ("peek:"+stack.peek ());
        System.out.println (stack.search ("sandhya1"));
        System.out.println (stack.firstElement ());

        //stack.push (1);
        System.out.println (stack);
        ListIterator<String> listIterator= stack.listIterator ();
        while (listIterator.hasNext ()){
            System.out.println (listIterator.next ());
        }
        Enumeration<String> enumeration= stack.elements ();
        while (enumeration.hasMoreElements ()){
            System.out.println (enumeration.nextElement ());
        }
        Iterator<String> iterator= stack.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }

    }
}
