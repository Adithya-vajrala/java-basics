package com.java.fundamentals;

import java.util.Scanner;

public class SquarePatternProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr the number of units for side: ");
        byte unitsForSide = scanner.nextByte();
        for (int i = 1; i <= unitsForSide ; i++) {
            for (int j = 1; j <= unitsForSide ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
