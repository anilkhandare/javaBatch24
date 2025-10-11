package com.com.exception.handling;

public class Demo extends  Exception{
    public static void main (String[] args) throws Exception {
         int mobile;
//throw  new RuntimeException ("runtime exception");

        //mobile= Integer.parseInt ("double eight zoro ");
        int i=10;
        try {
            System.out.println (i % 0);

        }catch (RuntimeException runtimeException){
            System.out.println ("Please make sure to divide by only valid number not negative or 0");
        }finally {
            System.out.println ("finally");
        }
    }
}
