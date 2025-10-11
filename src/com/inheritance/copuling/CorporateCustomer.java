package com.inheritance.copuling;

public class CorporateCustomer implements CustomerInfo {
    private  String name;

    public CorporateCustomer (String name) {
        this.name = name;
    }

    /**
     * @return
     */
    @Override
    public String getName () {
        return name;
    }
}
