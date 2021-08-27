package Arithmetic;
import java.util.Scanner;
interface Sub
{
	public  void diff();
}
public class Subtract implements Sub
{
	int x,y,result=0;
 	public void diff()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=sc.nextInt();
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
		result=x-y;
		System.out.println("The difference of " +" " + x +" " +"and" +" " +y +" " +"is" +" " +result);
		
	}
	
}