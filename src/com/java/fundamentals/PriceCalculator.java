package com.java.fundamentals;

import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Product Price: ");
        int productPrice = scanner.nextInt();
        System.out.println("Enter Age: ");
        byte age = scanner.nextByte();
        System.out.println("Enter the Membership type Silver->(S), Gold-(G), Diamond-(D) or Bronze-(B):");
        char membershipType = scanner.next().charAt(0);
        double discountPercentage;
        double discountPrice;
        double priceAfterDiscount;
        double centralTax;
        double stateTax;
        double finalPrice;
        if (membershipType == 'B')
           discountPercentage = 10;
         else if (membershipType == 'S')
            discountPercentage = 15;
         else if (membershipType == 'G')
            discountPercentage = 20;
         else if (membershipType == 'D')
            discountPercentage = 50;
         else
            discountPercentage = 0;

        if (age > 65)
            discountPercentage += 10;
         else if (age <= 65 && age > 45)
            discountPercentage += 8;
         else if (age <= 45 && age > 25)
            discountPercentage += 5;
         else
            discountPercentage += 0;
        discountPrice = productPrice * discountPercentage / 100;
        priceAfterDiscount = productPrice - discountPrice;
        centralTax = priceAfterDiscount * 2.5 / 100;
        stateTax = priceAfterDiscount * 2.5 / 100;
        finalPrice = priceAfterDiscount + centralTax + stateTax;
        System.out.println("Product Price: " + productPrice);
        System.out.println("Customer Membership: " + membershipType);
        System.out.println("Customer Age: " + age);
        System.out.println("Discount Amount: " + discountPrice);
        System.out.println("Price After Discount: " + priceAfterDiscount);
        System.out.println("Central Tax: " + centralTax);
        System.out.println("State Tax: " + stateTax);
        System.out.println("Final Price: " + finalPrice);
    }
}
