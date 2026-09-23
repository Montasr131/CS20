package Mastery;
/*
 * Program Name: Grade
 * Program Purpose: Determine the letter grade based on a percentage.
 * Last Date of Revision: September 23, 2026
 */

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the percentage
        System.out.print("Enter the percentage: ");
        int percentage = input.nextInt();

        // Determine the letter grade
        if (percentage >= 90) {
            System.out.println("The corresponding letter grade is: A");
        } else if (percentage >= 80) {
            System.out.println("The corresponding letter grade is: B");
        } else if (percentage >= 70) {
            System.out.println("The corresponding letter grade is: C");
        } else if (percentage >= 60) {
            System.out.println("The corresponding letter grade is: D");
        } else {
            System.out.println("The corresponding letter grade is: F");
        }

        input.close();
    }
}