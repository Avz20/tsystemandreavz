package com.tsystems.javaschool.tasks.currencyconverter;

import java.util.Scanner;

public class CurrencyConverterTest {

   public static void main(String[] args) {
        System.out.println("1 Dollar");
        System.out.println("2 Euro");

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the currency");

        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        sc.close();

        switch (choice) {
            case 1:
                Dollar_to_other(amount);
                break;
            case 2:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 79.37 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
        System.out.println();

        System.out.println("1 Dollar= " + 0.98 + " Euro");
        System.out.println();

        System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
    }
    
    public static void Euro_to_other(double amt){
        System.out.println("1 Euro = " + 80.85 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
        System.out.println();

        System.out.println("1 Euro = " + 1.02 + " Dollar");
        System.out.println();

        System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
    }

}