package com.interfacedemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main (String[] args) {
        Student student= new Student (1,"Sandhya");
        try(FileOutputStream outputStream= new FileOutputStream ("student.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream (outputStream)){
            objectOutputStream.writeObject (student);

            System.out.println ("Object serialization done");
        }catch (IOException ioException){
            ioException.printStackTrace ();
        }
    }
}
