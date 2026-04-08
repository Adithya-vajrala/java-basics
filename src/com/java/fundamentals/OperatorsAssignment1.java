package com.java.fundamentals;
import java.util.Scanner;

public class OperatorsAssignment1 {
    // Product Membership Billing System
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Product Price:");
        int productPrice = scanner.nextInt();
        System.out.println("Enter the Membership type Silver->(S), Gold-(G), Diamond-(D) or No Membership-(N):");
        char membershipType = scanner.next().charAt(0);
        System.out.println("Enter the Quantity:");
        byte quantity = scanner.nextByte();
        double discountPrice;
        double finalProductPrice;
        if (membershipType == 'S'){
            discountPrice = (productPrice * quantity) * (10 - 2.5 - 2.5) / 100;
            finalProductPrice = (productPrice * quantity) - discountPrice + 50;
            System.out.println("Product Price: " + productPrice);
            System.out.println("Discount Amount: " + discountPrice);
            System.out.println("Final Price per Product: " + finalProductPrice/quantity);
            System.out.println("Final Bill Amount: " + finalProductPrice);
            System.out.println("Total Amount Saved: " + discountPrice);
        }
        else if (membershipType == 'G') {
            discountPrice = (productPrice * quantity) * (15 - 2.5 - 2.5) / 100;
            finalProductPrice = (productPrice * quantity) - discountPrice + 20;
            System.out.println("Product Price: " + productPrice);
            System.out.println("Discount Amount: " + discountPrice);
            System.out.println("Final Price per Product: " + finalProductPrice/quantity);
            System.out.println("Final Bill Amount: " + finalProductPrice);
            System.out.println("Total Amount Saved: " + discountPrice);
        }
        else if (membershipType == 'D') {
            discountPrice = (productPrice * quantity) * (20 - 2.5 - 2.5) / 100;
            finalProductPrice = (productPrice * quantity) - discountPrice ;
            System.out.println("Product Price: " + productPrice);
            System.out.println("Discount Amount: " + discountPrice);
            System.out.println("Final Price per Product: " + finalProductPrice/quantity);
            System.out.println("Final Bill Amount: " + finalProductPrice);
            System.out.println("Total Amount Saved: " + discountPrice);
        }
        else {
            discountPrice = 0;
            finalProductPrice = (productPrice * quantity) - discountPrice + 100;
            System.out.println("Product Price: " + productPrice);
            System.out.println("Discount Amount: " + discountPrice);
            System.out.println("Final Price per Product: " + finalProductPrice/quantity);
            System.out.println("Final Bill Amount: " + finalProductPrice);
            System.out.println("Total Amount Saved: " + discountPrice);
        }
    }
}
