package com.inheritance.copuling;


public class BankAcount {

    private  CustomerInfo customer;

    public BankAcount (CustomerInfo customer) {
        this.customer = customer;
    }
    void displayCustomerInfo(){
        System.out.println ("customer name:"+customer.getName ());
    }

    public static void main (String[] args) {
        CustomerInfo customer1= new Customer ("sandhya");
        CustomerInfo customer2 = new CorporateCustomer ("Raj");
        BankAcount bankAccount= new BankAcount (customer1);
        BankAcount bankAccount1= new BankAcount (customer2);
        bankAccount.displayCustomerInfo ();
        bankAccount1.displayCustomerInfo ();

    }
}
