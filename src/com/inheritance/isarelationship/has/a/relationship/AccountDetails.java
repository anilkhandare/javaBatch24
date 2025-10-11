package com.inheritance.isarelationship.has.a.relationship;

import java.util.ArrayList;
import java.util.List;

public class AccountDetails {
    private  String accountNumber;
    private double balance;
    private List<Transaction> transactions= new ArrayList<Transaction> ();


    public AccountDetails (String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }
    void deposit(double amount){
        balance+=amount;
        transactions.add (new Transaction ("deposit",amount));
        System.out.println ("deposited amount is: "+amount);

    }
    void withdraw(double amount){
        if (amount>balance){
            System.out.println ("insufficient balance");
        }else
            balance-=amount;
         transactions.add (new Transaction ("withdrwal",amount));
        System.out.println ("withdrawal:"+amount);
    }
    void showbalance(){
        System.out.println ("account number:"+accountNumber);
        System.out.println ("balance:"+balance);
    }

    void showTransactionHistory(){
        System.out.println ("Transaction History");
        for (Transaction transaction:transactions){
            System.out.println (transaction);
        }
    }
}
