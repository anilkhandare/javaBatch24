package com.polymorphism.runtimepolymorphism;

public class B  extends A{

    @Override
    void sum (int i, int j) {
        super.sum (i, j);
        int result = i+j;
        System.out.println ("result of child clas B"+result);
    }


     private void test(){
         System.out.println ("test:B");
     }

     static void test2(){
         System.out.println ("test2:B");
     }

    public static void main (String[] args) {
        B b= new B ();
        b.sum (10,10);
        A a= new B ();//upcasting
        a.sum (2,2);
        A a1= new A ();
        a1.sum (3,3);
        b.test ();
        A.test2 ();
        //B b1=(B)new A();//downcast
        //b1.test ();
        //System.out.println (b1 instanceof A);//true
        m1 (a);
    }
    static void m1(A a){
        if(a instanceof B){
            B b= (B)a;//downcast
            System.out.println ("down casting is dones");
        }

    }

}
