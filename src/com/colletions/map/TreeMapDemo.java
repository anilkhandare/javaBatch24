package com.colletions.map;

import com.colletions.CustomSorting;
import com.colletions.Student;

import java.util.*;

public class TreeMapDemo {
    public static void main (String[] args) {
        TreeMap<String ,String> stringTreeMap= new TreeMap<> ();
        stringTreeMap.put ("a","a");
        stringTreeMap.put ("k","k");
        stringTreeMap.put ("c","c");
        stringTreeMap.put ("v","v");
        stringTreeMap.put ("s","s");
        stringTreeMap.put ("v","v");
        stringTreeMap.put ("s","s");
        //stringTreeMap.put (null,"s");
        System.out.println (stringTreeMap);

        TreeMap<String,Student> students= new TreeMap<> ();

        students.put ("vishal",new Student (1,"vishal"));

        students.put("sandhya",new Student (2,"sandhya"));

        students.put("vishal",new Student (1,"vishal"));//duplicate

        students.put ("akash",new Student (1,"akash"));

        students.put ("raj",new Student (2,"raj"));

        students.put ("yogesh",new Student (1,"yogesh"));
        System.out.println (students);
        System.out.println ("==================================");
        for(Map.Entry<String,Student> entry:students.entrySet ()){
            System.out.println (entry.getValue ());
        }

        TreeMap<Integer,Student> students1= new TreeMap<> ();

        students1.put (102,new Student (1,"vishal"));

        students1.put(34,new Student (2,"sandhya"));

        students1.put(87,new Student (1,"vishal"));//duplicate

        students1.put (103,new Student (1,"akash"));

        students1.put (105,new Student (2,"raj"));

        students1.put (101,new Student (1,"yogesh"));
        System.out.println (students);
        System.out.println ("==================================");

        for(Map.Entry<Integer,Student> entry:students1.entrySet ()){
            System.out.println (entry.getValue ());
        }
// custom sorting
        System.out.println ("============= custom sorting ================");

        TreeMap<Integer,Student> students3= new TreeMap<> ();

        students3.put (1,new Student (1,"vishal"));

        students3.put(2,new Student (2,"sandhya"));

        students3.put(1,new Student (1,"vishal"));//duplicate

        students3.put (1,new Student (1,"akash"));

        students3.put (2,new Student (2,"raj"));

        students3.put (1,new Student (1,"yogesh"));

        students3.put (3,new Student (3,"yogesh"));
        System.out.println ("first key:"+students3.firstKey ());
        System.out.println ("last key:"+students3.lastKey ());
        //System.out.println (students);
        System.out.println ("==================================");

        List<Student> studentList= new ArrayList<> (students3.values ());
        studentList.sort (Comparator.comparing (i->i.getName ()));
        for (Student s:studentList){
            System.out.println (s);
        }
    }
}
