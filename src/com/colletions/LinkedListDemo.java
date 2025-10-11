package com.colletions;

import java.time.LocalDateTime;
import java.util.*;

public class LinkedListDemo {
    public static void main (String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<> ();
        integerLinkedList.add (1);
        integerLinkedList.add (2);
        integerLinkedList.add (1);
        integerLinkedList.add (2);
        integerLinkedList.add (1);
        integerLinkedList.add (null);
        integerLinkedList.add (null);
        System.out.println (integerLinkedList);

        System.out.println (LocalDateTime.now ());
        System.out.println (integerLinkedList.remove (2));
        System.out.println (integerLinkedList);
        System.out.println (LocalDateTime.now ());

        System.out.println ("==========================");

        integerLinkedList.addFirst (0);
        integerLinkedList.addLast (10);
        integerLinkedList.removeFirst ();
        integerLinkedList.offer (23);
        System.out.println ("peek:"+integerLinkedList.peek ());
        integerLinkedList.pollFirst ();
        Object[] i=integerLinkedList.toArray ();
        integerLinkedList.add (1,13);
        System.out.println (integerLinkedList);


        ArrayList<Integer> integerArrayList = new ArrayList<> ();
        integerArrayList.add (1);
        integerArrayList.add (2);
        integerArrayList.add (1);
        integerArrayList.add (2);
        integerArrayList.add (1);
        integerArrayList.add (null);
        integerArrayList.add (null);

        System.out.println ("======arraylist=========s");
        System.out.println (integerArrayList);
        System.out.println (LocalDateTime.now ());
        System.out.println (integerArrayList.remove (2));
        System.out.println (integerArrayList);
        System.out.println (LocalDateTime.now ());

        System.out.println ("=======arraylist operation==========");
        //integerArrayList.addFirst();



    }
}
