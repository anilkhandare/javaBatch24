package com.oops.datahiding;

public class Test {
    public static void main (String[] args) {
        Account account = new Account (" Anil K", "879978797", 400.0);

        //System.out.println ("directly trying to access balance:"+account.balance);
        System.out.println ("Name:" + account.getAccountHoderName ());
        System.out.println ("Account Numbe:" + account.getAccountNumber ());
        System.out.println ("Balance:" + account.getBalance ());
        account.deposit (500);
        account.withdrawl (400);
        account.withdrawl (600);
        account.withdrawl (500);
        account.withdrawl (2);
        account.withdrawl (2);
        account.withdrawl (2);

        System.out.println ("current balance is Rs:" + account.getBalance ());


          Student student = new Student () ;
          student.setSudentId (1);
          student.setStudentName ("sandhya");
          student.setStudentRollNo ("TECH12");
        System.out.println (student.getStudentName ());
        System.out.println (student.toString ());
    }
}
