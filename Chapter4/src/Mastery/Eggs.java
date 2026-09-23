package Mastery;
/*
 * Program Name: Eggs
 * Program Purpose: Calculate the cost of eggs purchased based on
 *                  the number of eggs.
 * Last Date of Revision: September 23, 2026
 */

import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the number of eggs
        System.out.print("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();

        double pricePerDozen;

        // Determine the price per dozen
        if (eggs < 48) {
            pricePerDozen = 0.50;
        } else if (eggs < 72) {
            pricePerDozen = 0.45;
        } else if (eggs < 132) {
            pricePerDozen = 0.40;
        } else {
            pricePerDozen = 0.35;
        }

        // Calculate the number of full dozens and extra eggs
        int dozens = eggs / 12;
        int extraEggs = eggs % 12;

        // Calculate the total cost
        double total = (dozens * pricePerDozen)
                + (extraEggs * (pricePerDozen / 12));

        // Display the result
        System.out.printf("The bill is equal to: $%.2f%n", total);

        input.close();
    }
}