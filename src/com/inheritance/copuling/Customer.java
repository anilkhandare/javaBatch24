package com.inheritance.copuling;

public class Customer implements CustomerInfo {
    private  String name;

    public Customer (String name) {
        this.name = name;
    }


    /**
     *
     */
    @Override
    public String getName () {
return  name;
    }
}
