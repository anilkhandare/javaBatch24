package com.recursion;

public class TelecomBilling {
    public static double calculateTotaloutStanding (Account account) {
        double total = account.outsatandingAmount;

        for (Account child : account.childAcount) {
            total += calculateTotaloutStanding (child);
        }
        return total;

    }

    public static void main (String[] args) {
        Account parentaccount= new Account (1,1100);
        Account childaccount1 = new Account (2,12000);
        Account childaccount2 = new Account (3,300);
        Account grandChild = new Account (4,400);

        parentaccount.addChild (childaccount1);
        childaccount2.addChild (grandChild);
        parentaccount.addChild (childaccount2);

        double totalbill= calculateTotaloutStanding (parentaccount);
        System.out.println ("total outstanding:"+   parentaccount.accountId+"="+totalbill);


    }

}
