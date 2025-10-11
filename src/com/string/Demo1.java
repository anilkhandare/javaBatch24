package com.string;

// different way to create the string object
public class Demo1 {
    public static void main (String[] args) {
        // by using literal
        String name="Vishal";
        String name2="Vishal";
        System.out.println ("name:"+name);
        System.out.println ("name2:"+name2);
        System.out.println ("hashcode for name:"+name.hashCode ());
        System.out.println ("hashcode for name2:"+name2.hashCode ());
        // by using new keyword
        String name1=new String ("Sandhya");
        String name3 = new String ("Sandhya");
        System.out.println ("name1 hashcode:"+name1.hashCode ());
        System.out.println ("hashcode of the name3:"+name3.hashCode ());

        String str="this is the java string class program";
        String str1=str+"session";
        System.out.println ("str1:"+str1.equals (str));

        String s="hello";
        String s1="he"+"llo";
        System.out.println (s==s1);
        System.out.println (s.equals (s1));

        String a="hello";
        String part="he";
        String b=(part+"llo").intern ();
        System.out.println ("b:"+b);
        System.out.println ("a:"+a);
        System.out.println ("part:"+part);
        System.out.println (a==b);
        System.out.println (a.equals (b));



        //pool a->hello
         // part->he
        // b->part+llo




    }
}
