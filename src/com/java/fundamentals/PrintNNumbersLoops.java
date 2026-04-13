package com.java.fundamentals;

import java.util.Scanner;

public class PrintNNumbersLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number that U want to print Numbers from 1 To that nember:");
        int n = scanner.nextInt();
        System.out.println("---------using For loop-----------------");
        System.out.print("Numbers: (1-" + n +"): ");
        for (int i = 1; i <= n ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("------------Using While loop-----------");
        int i= 1;
        System.out.print("Numbers: (1-" + n +"): ");
        while (i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
}
