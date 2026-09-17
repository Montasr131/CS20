package SkillBuilders;
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length;
        double width;
        double area;
        double perimeter;

        System.out.print("Enter the length: ");
        length = input.nextDouble();

        System.out.print("Enter the width: ");
        width = input.nextDouble();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        input.close();
    }
}