package SkillBuilders;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int tens;
        int ones;

        System.out.print("Enter a two-digit number: ");
        number = input.nextInt();

        ones = number % 10;
        tens = number / 10;

        System.out.println("Tens digit: " + tens);
        System.out.println("Ones digit: " + ones);

        input.close();
    }
}