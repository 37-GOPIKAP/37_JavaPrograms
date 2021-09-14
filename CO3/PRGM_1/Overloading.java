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
        Square Shape = new Shape();
        Shape.Area(20,12);
        Shape.Area(5);
        Shape.Area(10);
    }
}
