package com.multihreading.syncronisation;

public class Customer {
    int id;
    int amount =2000;
    synchronized void withdrawal( int amount) throws InterruptedException {

        if(this.amount>amount){
            System.out.println ("withdrawal amount :"+amount);
            wait ();

        }else
            System.out.println ("in sufficient bal or less balance");
        this.amount-=amount;
        System.out.println ("Transaction Completed ");
    }

    synchronized void deposit( int amount){
        System.out.println ("deposit amount +:"+amount);
        this.amount+=amount;
        System.out.println ("Amount Deposited ");
       notify ();
    }

    public static void main (String[] args) {
        Customer customer= new Customer ();

        new Thread (()-> {
            try {
                customer.withdrawal (100);
            } catch (InterruptedException e) {
                throw new RuntimeException (e);
            }
        }).start ();


        new Thread (()-> {
            customer.deposit (100);
        }).start ();

    }
}
