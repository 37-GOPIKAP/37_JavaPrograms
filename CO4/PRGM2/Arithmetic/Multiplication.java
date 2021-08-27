package Arithmetic;
import java.util.Scanner;
interface Mult
{
	public  void pro();
}
public class Multiplication implements Mult
{
	int x,y,result=0;
 	public void pro()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=sc.nextInt();
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
		result=x*y;
		System.out.println("The product of " +" "+ x +" "  +"and"+" "  +y +" "  +"is" +" "+result);
		
	}
	
}