package com.constructor;

public class BankAccount {
    String owner;
    double balance;
    BankAccount(String owner,double balance) throws IllegalAccessException {
        if (balance<0){
            throw  new IllegalAccessException ("balance can not be  negative");
        }
        this.owner=owner;
        this.balance=balance;
        System.out.println ("owner:"+owner);
        System.out.println ("balance:"+balance);
    }

    public static void main (String[] args) throws IllegalAccessException {
        BankAccount  bankAccount= new BankAccount ("sandhya",-1.0);
    }
}
