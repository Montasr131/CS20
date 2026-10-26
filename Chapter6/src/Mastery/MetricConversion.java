package Mastery;

/*
 * Program Name: MetricConversion
 * Program Purpose: Convert English measurements to metric units
 *                  and metric measurements to English units.
 * Last Date of Revision: October 26, 2026
 */

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        System.out.println("\nConvert:");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Feet to Centimeters");
        System.out.println("3. Yards to Meters");
        System.out.println("4. Miles to Kilometers");
        System.out.println("5. Centimeters to Inches");
        System.out.println("6. Centimeters to Feet");
        System.out.println("7. Meters to Yards");
        System.out.println("8. Kilometers to Miles");

        System.out.print("\nEnter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(number + " inches equals "
                        + inchesToCentimeters(number) + " centimeters.");
                break;

            case 2:
                System.out.println(number + " feet equals "
                        + feetToCentimeters(number) + " centimeters.");
                break;

            case 3:
                System.out.println(number + " yards equals "
                        + yardsToMeters(number) + " meters.");
                break;

            case 4:
                System.out.println(number + " miles equals "
                        + milesToKilometers(number) + " kilometers.");
                break;

            case 5:
                System.out.println(number + " centimeters equals "
                        + centimetersToInches(number) + " inches.");
                break;

            case 6:
                System.out.println(number + " centimeters equals "
                        + centimetersToFeet(number) + " feet.");
                break;

            case 7:
                System.out.println(number + " meters equals "
                        + metersToYards(number) + " yards.");
                break;

            case 8:
                System.out.println(number + " kilometers equals "
                        + kilometersToMiles(number) + " miles.");
                break;

            default:
                System.out.println("Invalid choice. Enter a number from 1 to 8.");
        }

        input.close();
    }

    // English to metric conversions
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double feetToCentimeters(double feet) {
        return feet * 30;
    }

    public static double yardsToMeters(double yards) {
        return yards * 0.91;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.6;
    }

    // Metric to English conversions
    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static double centimetersToFeet(double centimeters) {
        return centimeters / 30;
    }

    public static double metersToYards(double meters) {
        return meters / 0.91;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.6;
    }
}
