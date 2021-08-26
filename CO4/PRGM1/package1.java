/*Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle,
Square and Circle. Test the package by finding the area of these figures. */
import java.util.Scanner;
import Graphics.*;


public class package1
{
	public static void main(String args[])
	{
		
		Circle c=new Circle();
		c.area();
		Square s=new Square();
		s.area();
		Triangle t=new Triangle();
		t.area();
		Rectangle r=new Rectangle();
		r.area();
	}
} 