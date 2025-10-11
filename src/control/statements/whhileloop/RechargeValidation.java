package control.statements.whhileloop;

import java.util.Scanner;

public class RechargeValidation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int amount;
        do {
            System.out.println ("enter recharge amount");
            amount=scanner.nextInt ();
            if (amount<=0){
                System.out.println ("invalid ammount please inter valid amount for recharge ");
            }
        }while (amount<=0);
        System.out.println ("Recharge successful Rs. "+amount);
        scanner.close ();
    }
}
