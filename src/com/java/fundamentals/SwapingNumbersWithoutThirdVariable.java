package com.java.fundamentals;

import java.util.Scanner;

public class SwapingNumbersWithoutThirdVariable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First NUmber:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the Second Number:");
        int number2 = scanner.nextInt();
        System.out.println("-------Before Swapping---------");
        System.out.println("Number1:" + number1);
        System.out.println("Number2:" + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("-------After Swapping---------");
        System.out.println("Number1:" + number1);
        System.out.println("Number2:" + number2);
    }
}

