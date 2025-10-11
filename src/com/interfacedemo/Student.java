package com.interfacedemo;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.function.Function;
import java.util.function.Supplier;

public class Student implements Serializable, Remote,Cloneable {
    Address address;
    int id;
    String name;

    public Student (int id, String name) {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
