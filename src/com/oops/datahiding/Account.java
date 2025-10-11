package com.oops.datahiding;

public class Account {
    private double balance;
    private  String accountHoderName;
    private String accountNumber;

    public Account (String accountHoderName,String accountNumber,double initalDeposit) {

        this.accountHoderName = accountHoderName;
        this.accountNumber = accountNumber;
        if(initalDeposit>=0) {
            balance = initalDeposit;
        }else{
            balance=0;
            System.out.println ("initial deposit balance setting balance to 0");
        }
        this.balance = initalDeposit;
    }

    public double getBalance () {
        return balance;
    }

    public String getAccountHoderName () {
        return accountHoderName;
    }

    public String getAccountNumber () {
        return "xxx-xx"+ accountNumber.substring (accountNumber.length ()-3);
    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println ("amount is successfully Deposited : Rs."+amount);
        }else
            System.out.println ("invalid amount for deposit");
    }
    void withdrawl(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println ("Amount Rs:"+amount+ " withdrawal Successfully");
        }else
            System.out.println ("insufficient balance or invalid amount");
    }


}
