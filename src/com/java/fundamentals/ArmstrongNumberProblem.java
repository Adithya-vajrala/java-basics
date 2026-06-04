package com.java.fundamentals;

import java.util.Scanner;

public class ArmstrongNumberProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number u want to check: ");
        int userInput = scanner.nextInt();
        int power =(int) Math.pow(2,2);
        System.out.println(power);
    }
}
