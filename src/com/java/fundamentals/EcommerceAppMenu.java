package com.java.fundamentals;

import java.util.Scanner;

public class EcommerceAppMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Welcome to E-Commerce App");
        System.out.println("-------------------------------------");
        System.out.println("Menu:");
        System.out.println("1.Customer");
        System.out.println("2.Order");
        System.out.println("3.Product");
        System.out.println("4.Payment");
        System.out.println("5.Exit");
        System.out.println("Enter your input (1-5):");
        int userOption = scanner.nextInt();
        switch (userOption){
            case 1:
                System.out.println("Welcome to Customer Section");
                System.out.println("1.SignUp");
                System.out.println("2.Login");
                System.out.println("Enter the Input (1-2):");
                byte customerOption = scanner.nextByte();
                switch (customerOption) {
                    case 1:
                        System.out.println("SignUp successfully");
                        break;
                    case 2:
                        System.out.println("Logout successfully");
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                break;
            case 2:
                System.out.println("Welcome to Order Section");
                System.out.println("1.New Order");
                System.out.println("2.Exisiting Order");
                System.out.println("Enter the Input (1-2):");
                byte orderOption = scanner.nextByte();
                switch (orderOption) {
                    case 1:
                        System.out.println("New Order Placed");
                        break;
                    case 2:
                        System.out.println("Exisiting Order Placed");
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                break;
            case 3:
                System.out.println("Welcome to Product Section");
                System.out.println("1.Product Added successfully");
                System.out.println("2.Product Deleted Successfully");
                System.out.println("Enter the Input (1-2):");
                byte productOption = scanner.nextByte();
                switch (productOption) {
                    case 1:
                        System.out.println(" successfully");
                        break;
                    case 2:
                        System.out.println("Logout successfully");
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                break;
            case 4:
                System.out.println("Welcome to Payment Section");
                System.out.println("1.Payment Status");
                System.out.println("2.Payment Amount");
                System.out.println("Enter the Input (1-2):");
                byte paymentOption = scanner.nextByte();
                switch (paymentOption) {
                    case 1:
                        System.out.println("Payment Success");
                        break;
                    case 2:
                        System.out.println("Payment Amount:" + 1200 + "/-");
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option");
        }
        scanner.close();
    }
}
