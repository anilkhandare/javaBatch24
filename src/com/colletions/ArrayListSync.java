package com.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSync {
    public static void main (String[] args) {
        List<String> stringList= new ArrayList<> ();

        stringList.add ("sandhya");
        stringList.add ("vishal");
        stringList.add (null);
        System.out.println (stringList);
        List<String> synclist=Collections.synchronizedList (stringList);
        System.out.println (synclist);
    }
}
