package SkillBuilders;
import java.util.Scanner;

public class GradeAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade1, grade2, grade3, grade4, grade5;
        int total;
        double average;

        System.out.print("Enter grade 1: ");
        grade1 = input.nextInt();

        System.out.print("Enter grade 2: ");
        grade2 = input.nextInt();

        System.out.print("Enter grade 3: ");
        grade3 = input.nextInt();

        System.out.print("Enter grade 4: ");
        grade4 = input.nextInt();

        System.out.print("Enter grade 5: ");
        grade5 = input.nextInt();

        total = grade1 + grade2 + grade3 + grade4 + grade5;

        average = total / 5.0;

        System.out.println("Average grade: " + average + "%");

        input.close();
    }
}