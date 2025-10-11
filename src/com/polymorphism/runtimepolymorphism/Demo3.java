package com.polymorphism.runtimepolymorphism;

public class Demo3 extends  Demo2{

    @Override
    Demo3 get () {
        System.out.println ("this is the way to define method as covariant type to avoid classCastException");
       return this;
    }

    @Override
    String get (String msg) {
        return super.get (msg);
    }

    public static void main (String[] args) {
        Demo3 demo3 = new Demo3 ();
        demo3.get ();
        demo3.get ("hello");
    }
}
