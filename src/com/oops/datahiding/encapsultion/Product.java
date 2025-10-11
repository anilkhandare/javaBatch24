package com.oops.datahiding.encapsultion;

public class Product {
    private  int productId;
    private  String productName;
    private  double price;
    private  int stock;
    public

     Product (int productId, String productName, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
         setPrice (price);
        this.stock = stock;
    }

    public int getProductId () {
        return productId;
    }

    public void setProductId (int productId) {
        this.productId = productId;
    }

    public String getProductName () {
        return productName;
    }

    public void setProductName (String productName) {
        this.productName = productName;
    }

    public double getPrice () {

        return price;
    }

    public void setPrice (double price) {
        if (price>0){
            this.price=price;
        }else
            throw new IllegalArgumentException ("price must be positive");
    }

    public int getStock () {
        return stock;
    }

    public void setStock (int stock) {
        this.stock = stock;
    }
    public boolean reduceStock(int quantity ){
        if(quantity<=stock){
            stock-=quantity;
            return  true;
        }else
            return false;
    }
}
