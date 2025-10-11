package com.polymorphism.complietimepolymorphism;

import com.constructor.Demo;

public class Demo1 {
    void  sum(int i,int j){
        int result=i+j;
        System.out.println ("addition int:"+result);
    }
    void sum(double i,double j){
        double result=i+j;
        System.out.println ("addition double:"+result);
    }

    public static void main (String[] args) {
        Demo1 demo1= new Demo1 ();
        demo1.sum (1,1);
        demo1.sum (1.0,1.0);
    }
}
