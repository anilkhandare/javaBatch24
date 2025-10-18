package com.colletions;

import java.util.*;

public class HashSetDemo1
{
    public static void main (String[] args) {
        HashSet<String> stringHashSet= new HashSet<> ();
        System.out.println (stringHashSet.add ("anil"));
        System.out.println (stringHashSet.add ("vishal"));
        System.out.println (stringHashSet.add ("Sandhya"));
        System.out.println (stringHashSet.add ("anil"));
        System.out.println (stringHashSet);

        HashSet<Students> students= new HashSet<> ();
        students.add (new Students (1,"Vishal"));

        students.add (new Students (2,"sandhya"));

        students.add (new Students (1,"Vishal"));//duplicate
        Set<Students> students1= Collections.synchronizedSet (students);
        System.out.println (students);

        List<Integer> list= Arrays.asList (6,53,24,1,6);

        Collections.reverse (list);

        for(int i:list){
            int fre=Collections.frequency(list,i);
            System.out.println (i+" : "+fre);
        }

        System.out.println (list);


    }
}

class Students {

    int id;
    String name;

    public Students (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        return true;
    }

    @Override
    public int hashCode () {
        return Objects.hash (id, name);
    }
}
