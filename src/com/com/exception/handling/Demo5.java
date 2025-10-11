package com.com.exception.handling;

public class Demo5 {
    public static void m1(){
        int i=10/0;
        //Thread.sleep (200);

    }
    public static void m2(){
        m1 ();
    }
    public  static void m3(){

        try{
            m2();
        }catch (ArithmeticException ae){
            System.out.println ("arithmetic exception ");
        }
    }


    public static void main (String[] args) {
       m3 ();
    }
}
