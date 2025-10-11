package com.constructor;

public class Car {
    String brand;
    String year;

    Car(){
/*        brand="unknown";
        year="2009";*/
        this("TOyta","2024");
    }
    public  Car(String brand,String year){
        this.brand=brand;
        this.year=year;
    }
    void displayInfo(){
        System.out.println ("brand:"+brand);
        System.out.println ("year:"+year);
    }

    public static void main (String[] args) {
        Car car= new Car ();
//        Car car1= new Car ("TATA","2020");
        car.displayInfo ();
//        car1.displayInfo ();
    }

}
