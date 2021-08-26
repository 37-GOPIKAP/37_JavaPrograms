package Graphics;
interface Shape
{
	public void area();
	
}

public class Circle implements Shape
{
	int r;
	double pi=3.14,area=0;
	
	public void area()
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the radius :");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("Area of circle is " +area);
	}
}