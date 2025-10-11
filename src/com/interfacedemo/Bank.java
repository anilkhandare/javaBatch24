package com.interfacedemo;

public interface Bank {
    int i = 0;
/*    Bank(){

    }*/
    double interestRate=5.0;
    void loan();
    default void test(){
        System.out.println ("default method");

    }
    static void test2(){

    }

}
