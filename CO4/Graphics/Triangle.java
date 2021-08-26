package Graphics;
import java.util.Scanner;
interface Shape2
{
	public void area();
	
}

public class Triangle implements Shape2
{
	int b,h;
	double area=0;
	
	public void area()
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the breadth :");
		b=sc.nextInt();
		System.out.println("Enter the height :");
		h=sc.nextInt();
		area=0.5*b*h;
		System.out.println("Area of triangle is " +area);
	}
}