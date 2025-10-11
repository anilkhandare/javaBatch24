package com.polymorphism.runtimepolymorphism;

public class A {
    void sum(int i,int j){
        int result=i+j;
        System.out.println (result);
    }
    private  void test(){
        System.out.println ("test:A");
    }
    static  void test2(){
        System.out.println ("static:A");
    }
}
