package com.interfacedemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main (String[] args) {
        try (FileInputStream inputStream = new FileInputStream ("student.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream (inputStream)) {
            Student student = (Student) objectInputStream.readObject ();
            System.out.println ("Student:" + student);
        } catch (Exception ioException) {
            System.out.println ("class not found");
        }
    }}
