package com.inheritance.isarelationship.has.a.relationship;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private String transactionType;
    private  double amount;
    private LocalDateTime date;

    public Transaction (String transactionType,double amount) {
        this.date = LocalDateTime.now ();
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public String toString () {
        return "Transaction{" +
                "amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                ", date=" + date +
                '}';
    }
}
