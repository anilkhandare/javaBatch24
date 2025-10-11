package com.multihreading;

public class BankingSystem {
    public static void main (String[] args) {
        BankingTransactionTask transactionTask= new BankingTransactionTask ("Balance Transfer",Thread.MAX_PRIORITY);
        BankingTransactionTask notificationTask= new BankingTransactionTask ("SMS notification",Thread.NORM_PRIORITY);
        BankingTransactionTask logingtask= new BankingTransactionTask ("logging ",Thread.MIN_PRIORITY);
        transactionTask.start ();
        notificationTask.start ();
        logingtask.start ();


    }
}
