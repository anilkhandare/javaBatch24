package com.methods.demo.staticmethod;

public class Demo {

    public static void main (String[] args) {
      calculateSalary ();
      calculateSalary (1,3);
    }
    static int calculateSalary(){
        int basicSalary =1000;
        int hra=2000;
        int netSalary=basicSalary+hra;
        System.out.println ("netSalary:"+netSalary);
        return netSalary;
    }
    static int calculateSalary(int i,int j){
        int basicSalary =1000;
        int hra=2000;
        int netSalary=basicSalary+hra;
        System.out.println ("netSalary:"+netSalary);
        return netSalary;
    }

}
