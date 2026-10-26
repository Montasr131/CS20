package SkillBuilders;
import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        double answer = powerOf(num1, num2);

        System.out.println(num1 + " raised to the power of "
                + num2 + " = " + answer);

        input.close();
    }

    public static double powerOf(double number, int power) {
        return Math.pow(number, power);
    }
}