package com.java.fundamentals;

import java.util.Scanner;

public class MobileDataPlanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Data used in GB's:");
        byte dataUsed = scanner.nextByte();
        System.out.println("Enter Membership Type (P) for premium and (B) for basic:");
        char membershipType = scanner.next().charAt(0);
        int price = 0;
        if (membershipType == 'P'){
            if (dataUsed <= 5)
                price = 300;
             else
              price = 300 + (dataUsed - 5) * 10;
        } else if (membershipType == 'B'){
            if (dataUsed <= 2)
                price = 100;
             else
                price = 100 + (dataUsed - 2 ) * 20;

        } else
            System.out.println("Invalid Membership");
        System.out.println("Price: " + price);
    }
}
