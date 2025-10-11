package com.com.exception.handling;

public class Demo4 {
    public static void main (String[] args) {
        int[] a=new int[3];

        try {
            try{
                String s= null;
                int i=s.length ();
            }catch (NullPointerException np){
                System.out.println ("null pointer exception");
            }
            a[4]=10;
            System.out.println (a[4]);
        }catch (ArrayIndexOutOfBoundsException are){
            System.out.println ("index out of bounds");
        }
    }
}
