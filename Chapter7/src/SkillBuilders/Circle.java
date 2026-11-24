package SkillBuilders;

public class Circle
{
    private double radius;

    public Circle()
    {
        radius = 1.0;
    }

    public Circle(double r)
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public static void displayAreaFormula()
    {
        System.out.println("Area = PI * radius * radius");
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Circle)
        {
            Circle other = (Circle) obj;
            return Double.compare(radius, other.radius) == 0;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Circle has radius " + radius;
    }

    public static void main(String[] args)
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(4.0);
        Circle circle4 = new Circle(3.0);

        System.out.println(circle2);
        System.out.println(circle3);

        displayAreaFormula();

        System.out.println("Area: " + circle2.area());
        System.out.println("Circumference: " + circle2.circumference());

        System.out.println("Circle 2 equals Circle 4: " +
                           circle2.equals(circle4));

        System.out.println("Circle 2 equals Circle 3: " +
                           circle2.equals(circle3));
    }
}
