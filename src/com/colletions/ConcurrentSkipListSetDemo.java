package com.colletions;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {
    public static void main (String[] args) {
        ConcurrentSkipListSet concurrentSkipListSet= new ConcurrentSkipListSet ();
        concurrentSkipListSet.add ("vishal");
        concurrentSkipListSet.add ("sandhya");

        concurrentSkipListSet.add ("vishal");
        //concurrentSkipListSet.add (null);
        System.out.println (concurrentSkipListSet);
    }
}
