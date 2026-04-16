package com.java.fundamentals;

import java.util.Scanner;

public class CheckingPowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = scanner.nextInt();
        while (number % 2 ==0){
            number /= 2;
        }
        if (number == 1)
            System.out.println("Power of two");
        else
            System.out.println("Not a power of two");
    }
}
