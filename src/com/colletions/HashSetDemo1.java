package com.colletions;

import java.util.HashSet;
import java.util.Objects;

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

        System.out.println (students);


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
