package Mastery;
/*
 * Program Name: PrimeNumber
 *
 * Program Purpose: Determine whether a number entered by the user
 *                  is a prime number.
 *
 * Last Date of Revision: September 29, 2026
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }

        input.close();
    }
}