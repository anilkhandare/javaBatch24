package com.constructor;

import java.lang.reflect.Constructor;

public class Demo {


   public  Demo(){
        System.out.println ("Demo object is Created");
    }

    public   Demo(String name){
        System.out.println ("name:"+name);
    }
    public Demo(int id,String name){
        System.out.println ("id:"+id);
        System.out.println ("name:"+name);
    }
    int i;
    int j;

    public static void main (String[] args) {

        Constructor<?>[] constructor = Demo.class.getConstructors ();
        for (Constructor<?> constructor1:constructor){
            System.out.println ("constructor:"+constructor1);
        }
        Demo demo= new Demo ();
        Demo demo1= new Demo ("Sandhya");
        Demo demo2= new Demo (1,"Sandhya");


    }
}
