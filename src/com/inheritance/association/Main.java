package com.inheritance.association;

public class Main {
    public static void main (String[] args) {
        Customer customer = new Customer ("Sandhya",1,"sandhya@gmail.com");
        Order order= new Order ("12343",customer);
        Order order1 = new Order ("209u9u",customer);
        order.showOrder ();
        order1.showOrder ();
    }
}
