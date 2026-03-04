package com.mycompany.gradeaveragecalculator;

import java.util.Scanner;

public class GradeAverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first subject score: ");

        int score1 = input.nextInt();

        System.out.println("Enter your second subject score: ");
        int score2 = input.nextInt();

        System.out.println("Enter your third subject score: ");
        int score3 = input.nextInt();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.println("Your average score is: " + average);

        input.close();

    }
}
