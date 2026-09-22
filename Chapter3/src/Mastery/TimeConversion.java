package Mastery;
/*
 * Program Name: TimeConversion
 * Program Purpose: Convert a number of minutes into hours and minutes.
 * Last Date of Revision: September 21, 2026
 */

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the number of minutes
        System.out.print("Enter the time in minutes: ");
        int totalMinutes = input.nextInt();

        // Convert minutes into hours and remaining minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Display the result
        System.out.println("The time is " + hours + ":" + minutes);

        input.close();
    }
}