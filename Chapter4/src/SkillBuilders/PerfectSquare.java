package SkillBuilders;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int root = (int) Math.sqrt(number);

        if (root * root == number) {
            System.out.println("The number is a perfect square.");
            System.out.println("The square root of " + number + " is " + root + ".0");
        } else {
            System.out.println("The number is not a perfect square.");
        }

        input.close();
    }
}