package com.inheritance.isarelationship;

public class Test {
    public static void main (String[] args) {
        Parent p= new Parent ();
        p.method1 ();
       // p.method2 ();//java: cannot find symbol  symbol:   method method2() location: variable p of type com.inheritance.isarelationship.Parent
       Child c= new Child ();
       c.method1 ();
       c.method2 ();
       Parent p1= new Child ();
       p1.method1 ();
       //p1.method2 ();//Cannot resolve method 'method2' in 'Parent'
        //Child c1= new Parent ();
    }
}
