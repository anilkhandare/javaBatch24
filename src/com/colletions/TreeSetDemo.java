package com.colletions;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main (String[] args) {
        TreeSet<String> treeSet= new TreeSet<> (Comparator.reverseOrder ());
        treeSet.add ("sandhya");
        treeSet.add ("vishal");
        treeSet.add ("anil");
        treeSet.add ("sandhya");
        treeSet.add ("aa");
        System.out.println (treeSet);
        for (String t:treeSet){
            System.out.println (t);
        }

        TreeSet<Student> students= new TreeSet<> (new CustomSorting());

        students.add (new Student (1,"vishal"));

        students.add (new Student (2,"sandhya"));

        students.add (new Student (1,"vishal"));//duplicate

        students.add (new Student (1,"akash"));

        students.add (new Student (2,"raj"));

        students.add (new Student (1,"yogesh"));
        System.out.println (students);
        System.out.println ("========================");
        for (Student s:students){
            System.out.println (s);
        }

    }
}
