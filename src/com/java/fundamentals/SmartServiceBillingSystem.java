package com.java.fundamentals;

import java.util.Scanner;

public class SmartServiceBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the plan u want B-Basic, S-Standard, P-premium:");
        char planType = scanner.next().charAt(0);
        System.out.println("Enter Customer Type V-VIP, N-New, R-Regular:");
        char customerType = scanner.next().charAt(0);
        System.out.println("You Need Add-on Service! Enter (Y) If needed (N) Not Needed:");
        char addOnNeeded = scanner.next().charAt(0);
        System.out.println("Enter Usage Type H-Home and O-Office:");
        char usageType = scanner.next().charAt(0);
        int basePrice = 0;
        int addOnprice = 0;
        if (planType == 'B')
            basePrice = 500;
        else if (planType == 'S')
            basePrice = 1000;
        else if (planType == 'P')
            basePrice = 12000;
        else {
            System.out.println("Invalid plan");
            basePrice = 0;
        }
        if (addOnNeeded == 'Y'){
            addOnprice = 300;
            basePrice += addOnprice;
        }else
            addOnprice = 0;
        int discountPercentage;
        if (customerType == 'V')
            discountPercentage = 20;
        else if (basePrice == 1500)
            discountPercentage = 15;
        else if (customerType == 'N')
            discountPercentage = 15;
        else if (customerType == 'R')
            discountPercentage = 10;
        else
            discountPercentage = 0;
        int discountAmount = basePrice * discountPercentage / 100;
        int afterDiscount = basePrice - discountAmount;
        int taxAmount = afterDiscount * 5 / 100;
        System.out.println("Base Price: " + basePrice);
        System.out.println("Add-on price: " + addOnprice);
        System.out.println("Total Before Discount: " + basePrice);
        System.out.println("Discount Applied (%): " + discountPercentage);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Price After Discount: " + afterDiscount);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Final Price: " + (afterDiscount + taxAmount));
        if(planType == 'P' && customerType == 'V')
            System.out.println("Cashback: " + 200);
        scanner.close();
    }
}
