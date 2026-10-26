package Mastery;

/*
 * Program Name: House
 * Program Purpose: Display a house using separate methods.
 * Last Date of Revision: October 26, 2026
 */

public class House {

    // Main method
    public static void main(String[] args) {
        addRoof();
        addBase();
        addWalk();
    }

    // Displays the roof
    public static void addRoof() {
        System.out.println("       /\\");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /______\\");
    }

    // Displays the base of the house
    public static void addBase() {
        System.out.println("    |      |");
        System.out.println("    |      |");
        System.out.println("    |______|");
    }

    // Displays the walkway
    public static void addWalk() {
        System.out.println("    ........");
        System.out.println("    ........");
    }
}
