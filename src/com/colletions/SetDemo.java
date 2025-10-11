package com.colletions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main (String[] args) {
        Set<Integer> integerSet= new HashSet<> ();
        integerSet.add (1);// map.put(1,PRESENT)// 2341
        integerSet.add (3);// map.put(3,PRESENT)//3242
        integerSet.add (1);// map.put(1,PRESENT)
        integerSet.add (3);// map.put(3,PRESENT)
        integerSet.add (null);// map.put(null,PRESENT)//false
        integerSet.add (null);// map.put(null,PRESENT)

        System.out.println (integerSet);

        Iterator<Integer> iterator= integerSet.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }

    }
}
