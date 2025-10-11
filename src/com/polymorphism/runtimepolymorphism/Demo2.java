package com.polymorphism.runtimepolymorphism;

public class Demo2 {

    int i;
    Demo2(){
        
        i=10;
        System.out.println ("this is the place of instance var initializaiotn constructor: "+i);
    }
    {
        i=20;
        System.out.println ("this is the place of instance var initializaiotn block: "+i);
    }

    Demo2 get(){return this;
    }
    String get(String msg){
        return "hello";
    }
}
