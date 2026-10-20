package SkillBuilders;
import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Time Converter");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");
        System.out.print("Choose a conversion (1-4): ");

        int choice = input.nextInt();

        System.out.print("Enter the amount of time: ");
        double time = input.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(time + " hours = " + (time * 60) + " minutes");
                break;
            case 2:
                System.out.println(time + " days = " + (time * 24) + " hours");
                break;
            case 3:
                System.out.println(time + " minutes = " + (time / 60) + " hours");
                break;
            case 4:
                System.out.println(time + " hours = " + (time / 24) + " days");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}