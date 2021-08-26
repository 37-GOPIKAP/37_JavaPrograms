package Graphics;
import java.util.Scanner;
interface Shape3
{
	public void area();
	
} 

public class Rectangle implements Shape3
{
	int l,b,area=0;
	
	public void area()
	{
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the length :");
		l =sc.nextInt();
		System.out.println("Enter the breadth :");
		b =sc.nextInt();
		area=l*b;
		System.out.println("Area of rectangle is " +area);
	}
}