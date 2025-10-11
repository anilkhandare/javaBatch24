package com.inheritance.isarelationship.has.a.relationship;

public class Customer {
    private  String name;
    private  String email;
    private  String mobileNumber;

    public Customer (String name, String email, String mobileNumber) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getMobileNumber () {
        return mobileNumber;
    }

    public void setMobileNumber (String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    void  diaplayInfo(){
        System.out.println ("Name:"+name);
        System.out.println ("Email:"+email);
        System.out.println ("Mobile: "+mobileNumber);
    }
}
