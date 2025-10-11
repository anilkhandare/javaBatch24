package com.stringbuffer;

public class Demo2 {
    public static void main (String[] args) {

        StringBuffer stringBuffer= new StringBuffer ();
        System.out.println (stringBuffer.length ());

        System.out.println ("default capacity: "+stringBuffer.capacity ());
        StringBuffer stringBuffer1= new StringBuffer (20);
        System.out.println ("custom capacity:"+stringBuffer1.capacity ());

        System.out.println (stringBuffer1.length ());

        // insert method
        stringBuffer1.insert (0,"Raj");

        stringBuffer1.insert (3,"abcd");
        System.out.println (stringBuffer1.length ());
        stringBuffer1.insert (stringBuffer1.length (),"a");
        System.out.println (stringBuffer1);

        StringBuffer stringBuffer2= new StringBuffer ("hello");
        System.out.println (stringBuffer2.length ());

        stringBuffer2.insert (1,"bolo");

        System.out.println (stringBuffer2);



        StringBuffer sb= new StringBuffer ();//empty backpack
        System.out.println ("length:"+sb.length ());// 0 books inside bag
        System.out.println ("capacity:"+sb.capacity ());// can hold 16 books

        sb.append ("hello");
        System.out.println ("length:"+sb.length ());
        sb.append ("hello how are you ");
        System.out.println ("length:"+sb.length ());// 0 books inside bag
        System.out.println ("capacity:"+sb.capacity ());// can hold 16 books



    }
}
