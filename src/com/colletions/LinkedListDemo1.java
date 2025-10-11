package com.colletions;

import java.time.LocalDateTime;
import java.util.*;

public class LinkedListDemo1 {
    public static void main (String[] args) {
        Queue<Integer> integerLinkedList = new LinkedList<> ();
        integerLinkedList.add (1);
        integerLinkedList.add (2);
        integerLinkedList.add (1);
        integerLinkedList.add (2);
        integerLinkedList.add (1);
        integerLinkedList.add (null);
        integerLinkedList.add (null);
        System.out.println (integerLinkedList);
        //Deque<Integer> arrylist= new ArrayList<> ();
       // arrylist.add (1);
       // System.out.println (arrylist);

    }
}
