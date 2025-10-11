package com.inheritance.association;

public class Customer {
    private  String customerName;
    private  int customerId;
    private  String emailId;

    public Customer (String customerName, int customerId, String emailId) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.emailId = emailId;
    }

    public String getCustomerName () {
        return customerName;
    }

    public int getCustomerId () {
        return customerId;
    }

    public String getEmailId () {
        return emailId;
    }
}
