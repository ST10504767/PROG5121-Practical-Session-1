package com.mycompany.timeconverter;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a time in hours: ");
        double hours = input.nextDouble();

        double minutes = hours * 60;
        double seconds = hours * 3600;

        System.out.println("Time in minutes: " + minutes);
        System.out.println("Time in seconds: " + seconds);

        input.close();

    }
}
