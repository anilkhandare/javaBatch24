package com.inheritance.association;

public class Order {
    private  String orederId;
    private  Customer customer;

    public Order (String orederId, Customer customer) {

        this.orederId = orederId;
        this.customer = customer;
    }
    void showOrder(){
        System.out.println ("OrderId: "+orederId);
        System.out.println ("customer Name:"+customer.getCustomerName ());
    }
}
