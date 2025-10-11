package com.com.exception.handling;

public class Demo2 {
    public static void main (String[] args) {
        try{
         String s=null;
            System.out.println (s);
            int l=s.length ();
            System.out.println (l);
        }catch (ArithmeticException ae){
            System.out.println ("null pointer exception");
        }catch (NullPointerException np){
            np.printStackTrace ();
        }

        catch (Exception ae){
            System.out.println ("in exception");
        }
    }
}
