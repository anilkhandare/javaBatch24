package com.oops.datahiding.encapsultion;

public class EcomApp {
    public static void main (String[] args) {
        Product p= new Product (1,"mango",120.0,10);
        try {
            Order order= new Order (p,12);
            System.out.println ("order Placed Successfully");
            System.out.println ("Product Name:"+p.getProductName ());
            System.out.println ("Price:"+p.getPrice ());
            System.out.println ("Total Amount:"+order.getTotalAmount ());
            System.out.println ("Product stock:"+p.getStock ());
        }catch (Exception e){
            System.out.println ("error:"+e.getMessage ());
        }
    }
}
