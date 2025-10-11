package com.colletions;

import java.time.Instant;
import java.util.ArrayList;

public class ArrrayListDemo {
    public static void main (String[] args) {
        ArrayList list= new ArrayList ();//default capacity 10[0,...,9]
        list.add (1);
        list.add (2);
        list.add (3);

        list.add (4);

        list.add (5);//removed
        list.add (6);
        list.add (7);
        list.add (8);
        list.add (9);
        list.add (10);
        list.add (11);
        list.add (null);
        list.add (null);
        list.add (null);
        list.add (11);
        System.out.println (Instant.now ());
        System.out.println (list.get (6));
        System.out.println (Instant.now ());
        list.remove (4);
        System.out.println (Instant.now ());
        System.out.println (list);
        System.out.println (Instant.now ());


    }
}

