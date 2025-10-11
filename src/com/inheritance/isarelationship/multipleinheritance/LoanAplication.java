package com.inheritance.isarelationship.multipleinheritance;

import java.util.Scanner;

public class LoanAplication implements LoanDetails,CustomerDetails,DocumentVerification{

    //data members
    private String customerName;
    private String customerId;
    private  double loanAmount;
    private  double interstRate;
    private   boolean documentVerfied;

    // constructor
    public LoanAplication (String customerName, String customerId, double loanAmount, double interstRate, boolean documentVerfied) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.loanAmount = loanAmount;
        this.interstRate = interstRate;
        this.documentVerfied = documentVerfied;
    }

    /**
     * @return
     */
    @Override
    public String getCustomerName () {
        return customerName;
    }

    /**
     * @return
     */
    @Override
    public String getCustomerId () {
        return customerId;
    }

    /**
     * @return
     */
    @Override
    public boolean getDoucumentVerfy () {
        return documentVerfied;
    }

    /**
     * @return
     */
    @Override
    public double getLoanAmount () {
        return loanAmount;
    }

    /**
     * @return
     */
    @Override
    public double getLoanIntrestRate () {
        return interstRate;
    }

    public  double calculateIntrestRate(int years){
        return (loanAmount*interstRate*years)/100;
    }
    public  void displayLoanApplicationDetails(int years){
        System.out.println ("====loan application details====");

        System.out.println ("Customer Name:"+getCustomerName ());
        System.out.println ("Customer ID:"+getCustomerId ());
        System.out.println ("Loan Amount:"+getLoanAmount ());
        System.out.println ("Intrest Rate:"+getLoanIntrestRate ());
        System.out.println ("Loan Duration "+years);
        System.out.println ("Document Verification :"+getDoucumentVerfy ());
        System.out.println ("Total Interest:"+calculateIntrestRate (years));

        System.out.println ("----------------------------------");
    }

    public static void main (String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println ("Enter Customer Name:");
        String name=scanner.nextLine ();
        System.out.println ("Enter Custoemr ID:");
        String id=scanner.nextLine ();
        System.out.println ("Enter Loan Amount:");
        double loanAmount=scanner.nextDouble ();
        System.out.println ("Enter Loan Duration:");
        int years=scanner.nextInt ();
        System.out.println ("Enter Interest Rate %:");
        double interestRate=scanner.nextDouble ();
        System.out.println ("are document verified?");
        boolean documentVerified=scanner.nextBoolean ();

        LoanAplication loanAplication= new LoanAplication (name,id,loanAmount,interestRate,documentVerified);

        loanAplication.displayLoanApplicationDetails (years);
        scanner.close ();

    }
}
