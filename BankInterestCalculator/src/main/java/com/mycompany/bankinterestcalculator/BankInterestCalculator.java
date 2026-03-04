package com.mycompany.bankinterestcalculator;

import java.util.Scanner;

public class BankInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount (P): ");
        double principal = input.nextDouble();

        System.out.println("Enter the rate of interest (R): ");
        double rate = input.nextDouble();

        System.out.println("Enter the time in years (T): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest earned: " + simpleInterest);

        input.close();

    }
}
