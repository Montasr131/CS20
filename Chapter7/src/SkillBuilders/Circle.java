package SkillBuilders;
public class Circle
{
    private double radius;

    // Default constructor
    public Circle()
    {
        radius = 1.0;
    }

    // Overloaded constructor
    public Circle(double r)
    {
        radius = r;
    }

    // Set radius
    public void setRadius(double r)
    {
        radius = r;
    }

    // Get radius
    public double getRadius()
    {
        return radius;
    }

    // Calculate area
    public double area()
    {
        return Math.PI * radius * radius;
    }

    // Calculate circumference
    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    // Display area formula
    public static void displayAreaFormula()
    {
        System.out.println("Area = PI * radius * radius");
    }

    // Override equals method
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

    // Override toString method
    @Override
    public String toString()
    {
        return "Circle has radius " + radius;
    }
}