package SkillBuilders;

public class Rectangle
{
    private double length;
    private double width;

    public Rectangle()
    {
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }

    public void setLength(double l)
    {
        length = l;
    }

    public double getLength()
    {
        return length;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public double getWidth()
    {
        return width;
    }

    public double area()
    {
        return length * width;
    }

    public double perimeter()
    {
        return 2 * (length + width);
    }

    public static void displayAreaFormula()
    {
        System.out.println("Area = length * width");
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Rectangle)
        {
            Rectangle other = (Rectangle) obj;

            return Double.compare(length, other.length) == 0 &&
                   Double.compare(width, other.width) == 0;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Rectangle has length " + length +
               " and width " + width;
    }

    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        Rectangle rectangle3 = new Rectangle(4.0, 2.0);
        Rectangle rectangle4 = new Rectangle(5.0, 3.0);

        System.out.println(rectangle2);
        System.out.println(rectangle3);

        displayAreaFormula();

        System.out.println("Area: " + rectangle2.area());
        System.out.println("Perimeter: " + rectangle2.perimeter());

        System.out.println("Rectangle 2 equals Rectangle 4: " +
                           rectangle2.equals(rectangle4));

        System.out.println("Rectangle 2 equals Rectangle 3: " +
                           rectangle2.equals(rectangle3));
    }
}
