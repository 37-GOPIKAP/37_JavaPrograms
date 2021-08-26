package Graphics;
import java.util.Scanner;
interface Shape1
{
	public void area();
	
} 

public class Square implements Shape1
{
	int a,area=0;
	
	public void area()
	{
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the value of a :");
		a =sc.nextInt();
		area=a*a;
		System.out.println("Area of square is " +area);
	}
}