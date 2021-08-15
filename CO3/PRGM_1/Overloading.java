//Java program to find the area of different shapes using method overloading
class Square 
{
    void Area(double a)
    {
        System.out.println("Area of the Square: "+ a * a);
    }
}
class Circle 
{
  
    void Area(double r)
    {
        double A = Math.PI * r * r;
  
        System.out.println("Area of the circle is :" + String.format("%.2f", A));
    }
}
class Rectangle 
{
    void Area(double l, double w)
    {
        System.out.println("Area of the rectangle: " + l * w);
    }
}
public class Overloading
{
    public static void main(String[] args)
    {
        Rectangle Shape = new Rectangle();
        Shape.Area(20,12);
        Circle Shape1 = new Circle();
        Shape1.Area(5);
        Square Shape2 = new Square();
        Shape2.Area(10);
    }
}
