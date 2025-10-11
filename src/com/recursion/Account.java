package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class Account {
    int accountId;
    double outsatandingAmount;
    List<Account> childAcount;

    public Account (int accountId, double outsatandingAmount) {
        this.accountId = accountId;
        this.outsatandingAmount = outsatandingAmount;
        this.childAcount = new ArrayList<> ();
    }
    public void addChild(Account child){
        this.childAcount.add (child);
    }
}
