package com.mycompany.bmicalculator;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kg: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);

        System.out.println("Your BMI is: " + BMI);

        input.close();

    }
}
