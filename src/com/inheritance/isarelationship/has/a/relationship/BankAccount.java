package com.inheritance.isarelationship.has.a.relationship;

public class BankAccount {
    private Customer customer;//aggregation
    private  AccountDetails accountDetails;//composition

    public BankAccount () {

        this.customer= new Customer ("sandhya","sandhy@gmail.com","90908898");
        this.accountDetails= new AccountDetails ("7687997980989",6000.0);

    }
    void showAccountInfo(){
        customer.diaplayInfo ();
        accountDetails.showbalance ();
    }
    void deposit(double amount){
        accountDetails.deposit (amount);
    }
    void  withdraw(double amount){
        accountDetails.withdraw(amount);
    }
    void  showTransactionHistory(){
        accountDetails.showTransactionHistory ();
    }
}
