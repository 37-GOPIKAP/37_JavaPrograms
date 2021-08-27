package Arithmetic;
import java.util.Scanner;
interface Sum
{
	public  void add();
}
public class Addition implements Sum
{
	int x,y,result=0;
 	public void add()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=sc.nextInt();
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
		result=x+y;
		System.out.println("The sum of " +" "+ x  +" " +"and" + " " +y +" " +"is" +" " +result);
		
	}
	
}