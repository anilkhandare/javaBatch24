package com.colletions.map;

import com.colletions.Student;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LinkedHashMapDemo {
    public static void main (String[] args) {
        LinkedHashMap<Integer,Integer> linkedHashMap= new LinkedHashMap<> ();
        linkedHashMap.put (1,1);

        linkedHashMap.put (1,2);
        linkedHashMap.put (2,2);
        linkedHashMap.put (3,3);

        linkedHashMap.put (4,3);


        System.out.println (linkedHashMap);
        List<Student> classAstudentList = new ArrayList<> ();
        classAstudentList.add (new Student (1,"Snadhya"));
        classAstudentList.add (new Student (2,"Vishal"));
        classAstudentList.add (new Student (3,"anil"));

        List<Student> classCstudentList = new ArrayList<> ();
        classCstudentList.add (new Student (1,"Snadhya"));
        classCstudentList.add (new Student (2,"dfsd"));
        classCstudentList.add (new Student (3,"ddd"));

        List<Student> classBstudentList = new ArrayList<> ();
        classBstudentList.add (new Student (1,"Snadhya"));
        classBstudentList.add (new Student (2,"aac"));
        classBstudentList.add (new Student (3,"dsds"));

        LinkedHashMap<String, List<Student>> studentLinkedHashMap= new LinkedHashMap<> ();
        studentLinkedHashMap.put ("Class A",classAstudentList);
        studentLinkedHashMap.put ("Class B",classBstudentList);
        studentLinkedHashMap.put ("Class C",classCstudentList);
        System.out.println (studentLinkedHashMap);





    }
}
