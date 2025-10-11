package com.colletions;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main (String[] args) {
        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<> ();
        linkedHashSet.add ("anil");
        linkedHashSet.add ("vishal");
        linkedHashSet.add ("sandhya");
        linkedHashSet.add ("Anil");
        System.out.println (linkedHashSet);
        LinkedHashSet<Students> students= new LinkedHashSet<> ();


        students.add (new Students (1,"Vishal"));

        students.add (new Students (2,"sandhya"));

        students.add (new Students (1,"Vishal"));//duplicate

        System.out.println (students);
    }
}
