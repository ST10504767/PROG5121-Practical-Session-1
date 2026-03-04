package com.mycompany.currencyconverter;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in USD: ");

        double USD = input.nextDouble();

        double USDToEUR = 0.92;
        double USDToGBP = 0.75;

        double EUR = USD * USDToEUR;
        double GBP = USD * USDToGBP;

        System.out.println("Amount in EUR: " + EUR);
        System.out.println("Amount in GBP: " + GBP);

        input.close();

    }
}
