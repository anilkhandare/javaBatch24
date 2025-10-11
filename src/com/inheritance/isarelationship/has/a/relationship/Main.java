package com.inheritance.isarelationship.has.a.relationship;

public class Main {
    public static void main (String[] args) {

        BankAccount account= new BankAccount ();

        System.out.println ("=====actual balance====");
        account.showAccountInfo ();
        System.out.println ("=====before withdrawal====");
        account.deposit (1000);
        account.showAccountInfo ();
        System.out.println ("====after withdrawal===");
        account.withdraw (2000);
        account.showAccountInfo ();
        System.out.println ("====Transaction History========");
        account.showTransactionHistory ();
    }
}
