import java.util.Scanner;
class Shapes 
{
    void Area(int a)
    {
        System.out.println("Area of the Square: "+ a * a);
    }

  
   void Area(double r)
    {
        double A = Math.PI * r * r;
  
        System.out.println("Area of the circle is :" + String.format("%.2f", A));
    }

    void Area(double l, double w)
    {
        System.out.println("Area of the rectangle: " + l * w);
    }
}
public class Overloading
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
              float r,l,w;
	      int sq;
              Shapes s=new Shapes();
              System.out.println("Enter the side of the Square:");
              sq=sc.nextInt();
              s.Area(sq);
              System.out.println("Enter the sides of the Rectangle :");
              System.out.println("Length:");
              l=sc.nextFloat(); 
              System.out.println("Width:");
              w=sc.nextFloat();
              s.Area(l,w); 
              System.out.println("Enter the radius of the Circle  :");
              r=sc.nextFloat();
              s.Area(r); 
    }
}