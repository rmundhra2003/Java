package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double purchaseAmount = 0;
        int taxCode = 0;
        double salesTax = 0;
        double totalAmount = 0;
        String customerName = new String();

        Scanner keyboard = new Scanner(System.in);
        //Input customerName
        System.out.print("Enter the customer name: ");
        customerName = keyboard.nextLine();

	    //Input purchaseAmount
        System.out.print("Enter the purchase amount: ");
        purchaseAmount = keyboard.nextDouble();

        //Input taxCode
        System.out.print("Enter the tax code: ");
        taxCode = keyboard.nextInt();

        //Compute sales tax

        switch(taxCode)
        {
            case 0:
                //tax exempt
                salesTax = 0;
                break;
            case 1:
                //sales tax = 3%
                salesTax = purchaseAmount*.03;
                break;
            case 2:
                //sales tax = 5%
                salesTax = purchaseAmount*.05;
                break;
            case 3:
                //sales tax = 7%
                salesTax = purchaseAmount*.07;
                break;
            default:
                System.out.printf("This tax code is invalid %d",taxCode);
                return;
        }
    //Output Customer Name, purchase amount, sales tax and total amount
        System.out.println("Customer name: "+customerName);
        System.out.println("Purchase Amount: "+purchaseAmount);
        System.out.println("Sales tax: "+salesTax);
        System.out.println("Total amount: "+(purchaseAmount+salesTax));

    }
}
