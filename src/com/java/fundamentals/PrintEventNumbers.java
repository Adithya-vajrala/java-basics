package com.java.fundamentals;

import java.util.Scanner;

public class PrintEventNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to get the Even Numbers from 1 to that number: ");
        int userInput  = scanner.nextInt();
        int n = 1;
        System.out.print("Even Numbers:");
        while (n <= userInput){
            if (n % 2 == 0)
                System.out.print(" " + n);
            n++;
        }
        scanner.close();
    }
}
