package com.java.fundamentals;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age: ");
        byte age = scanner.nextByte();
        System.out.println("Age: " + age);
        System.out.println("Enter Total marks: ");
        short totalMarks = scanner.nextShort();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Enter salary: ");
        int salary = scanner.nextInt();
        System.out.println("Salary: " + salary);
        System.out.println("Enter PhoneNo: ");
        long phoneNumber = scanner.nextLong();
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Enter Height: ");
        float height = scanner.nextFloat();
        System.out.println("Height: " + height);
        System.out.println("Enter the Average Salary: ");
        double averageSalary = scanner.nextDouble();
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Enter Gender: ");
        char gender = scanner.next().charAt(0);
        System.out.println("Gender: " + gender);
        System.out.println("Enter (True/False): ");
        boolean isTrueOrFalse = scanner.nextBoolean();
        System.out.println("Is (True/False): " + isTrueOrFalse);
        scanner.close();
    }
}
