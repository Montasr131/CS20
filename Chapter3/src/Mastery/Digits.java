package Mastery;
/*
 * Program Name: Digits
 * Program Purpose: Separate a three-digit number into its hundreds,
 *                  tens, and ones digits.
 * Last Date of Revision: September 21, 2026
 */

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for a three-digit number
        System.out.print("Enter a three-digit number: ");
        int number = input.nextInt();

        // Find each digit
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        // Display the results
        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The ones-place digit is: " + ones);

        input.close();
    }
}