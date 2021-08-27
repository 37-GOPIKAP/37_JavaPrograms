package Arithmetic;
import java.util.Scanner;
interface Div
{
	public  void divi();
}
public class Division implements Div
{
	int x,y,result=0;
 	public void divi()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=sc.nextInt();
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
		result=x/y;
		System.out.println(+ x +" " +"divides"  +" " +y  +" " +"is" +" " +result);
		
	}
	
}