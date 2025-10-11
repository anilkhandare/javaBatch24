package com.arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main (String[] args) {
        int a[]={3,-1,4,1,1};

        Arrays.sort (a);
        for(int element:a){
            System.out.println (element);
        }
        boolean found=false;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                System.out.println ("duplicate:"+a[i]);
                found=true;
            }
            /*while (i<a.length-1 && a[i]==a[i+1]){
                i++;
            }*/
        }
    }

}
