package SkillBuilders;
import java.util.Scanner;

public class Oddsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i += 2) {
            sum += i;
        }

        System.out.println("Sum of odd numbers: " + sum);

        input.close();
    }
}