package com.java.fundamentals;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int result;
        int digit = 0;
        while (number >= 10){
            result = 0;
            while (number>0) {
                digit = number % 10;
                result += digit;
                number = number / 10;
            }
            System.out.println(result);
            number = result;
        }
        System.out.println("output:" + number);
        scanner.close();
    }
}
