package Mastery;
/*
 * Program Name: Investment
 *
 * Program Purpose: Calculate how many years it takes for a $2,500
 *                  investment to reach at least $5,000 with 7.5%
 *                  annual compound interest.
 *
 * Last Date of Revision: September 29, 2026
 */

public class Investment {
    public static void main(String[] args) {

        double investment = 2500;
        int years = 0;

        while (investment < 5000) {
            investment = investment * 1.075;
            years++;
        }

        System.out.println("Years needed: " + years);
        System.out.println("Final investment: $" + investment);
    }
}