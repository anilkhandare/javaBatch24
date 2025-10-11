package com.oops.datahiding.encapsultion;

public class Order {
    private  Product product;
    private  int quantity;
    private  double totalAmount;

    public Order (Product product, int quantity) throws IllegalAccessException {
        this.product = product;
        setQuantity (quantity);
        calculateTotal ();

    }

    public Product getProduct () {
        return product;
    }

    public void setProduct (Product product) {
        this.product = product;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity (int quantity) throws IllegalAccessException {
        if(quantity>0 && product.reduceStock (quantity)){
            this.quantity = quantity;
        }else
            throw  new IllegalAccessException ("out of stock");

    }

    public double getTotalAmount () {
        return totalAmount;
    }

    public void setTotalAmount (double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void calculateTotal(){
        this.totalAmount=product.getPrice ()*quantity;
    }
}
