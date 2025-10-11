package com.com.exception.handling;

public class ExceptionMethods
{
    public static void main (String[] args) {
        int i=9;
        try {
            int result=i/0;
        }catch (Exception e){
            System.out.println (e.getLocalizedMessage ());
            System.out.println (e.getMessage ());
        }


    }
}
