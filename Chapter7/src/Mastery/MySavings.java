
package Mastery;

import java.util.Scanner;

/*
 * Program Name: MySavings
 * Program Purpose: Allow the user to add and remove coins
 *                  and display the total amount of money.
 * Last Date of Revision: November 24, 2026
 */

class PiggyBank {

    private int totalCents;

    public PiggyBank() {
        totalCents = 0;
    }

    public void addPenny() {
        totalCents += 1;
    }

    public void addNickel() {
        totalCents += 5;
    }

    public void addDime() {
        totalCents += 10;
    }

    public void addQuarter() {
        totalCents += 25;
    }

    public boolean takeMoneyOut(int cents) {
        if (cents > 0 && cents <= totalCents) {
            totalCents -= cents;
            return true;
        }
        return false;
    }

    public double getTotal() {
        return totalCents / 100.0;
    }
}

public class MySavings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();

        int choice = 0;

        while (choice != 7) {

            System.out.println("\n1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("7. Quit.");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf("Total: $%.2f%n",
                            bank.getTotal());
                    break;

                case 2:
                    bank.addPenny();
                    System.out.println("Penny added.");
                    break;

                case 3:
                    bank.addNickel();
                    System.out.println("Nickel added.");
                    break;

                case 4:
                    bank.addDime();
                    System.out.println("Dime added.");
                    break;

                case 5:
                    bank.addQuarter();
                    System.out.println("Quarter added.");
                    break;

                case 6:
                    System.out.print("Enter amount to remove in dollars: ");
                    double amount = input.nextDouble();
                    int cents = (int) Math.round(amount * 100);

                    if (bank.takeMoneyOut(cents)) {
                        System.out.println("Money removed.");
                    } else {
                        System.out.println("Not enough money in bank.");
                    }
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
