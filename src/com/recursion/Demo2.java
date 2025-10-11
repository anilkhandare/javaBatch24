package com.recursion;

public class Demo2 {
   static int factorial(int n){
        if(n==0 || n==1) {// base case
            return 1;
        }
        return n*factorial (n-1);// recursive call

    }

    public static void main (String[] args) {
        System.out.println (factorial (5));
    }
}
