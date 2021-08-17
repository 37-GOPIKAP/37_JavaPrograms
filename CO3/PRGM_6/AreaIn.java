import java.util.Scanner;
interface  Shapes
{
	public void Area();
	public void Peri();
	
}
class Circle implements Shapes
{
	double r,A,P;
	Scanner sc=new Scanner(System.in);
	 Circle()
	{
		System.out.println("\nEnter the radius:");
		r= sc.nextDouble();
	}
		
	public void Area()
	{
		
		A=Math.PI*r*r;
		System.out.println("Area of the circle is :"+String.format("%.2f",A));
	}
	public void Peri()
	{
		
		P=2*Math.PI*r;
		System.out.println("Perimeter of circle is:" +String.format("%.2f",P));
		
	}
	
}
 class Rectangle implements Shapes
{
	int length, breadth;
	int Ar,Pm;
	Scanner sc=new Scanner(System.in);
	 Rectangle()
	{
		System.out.println("Enter the length:");
		length=sc.nextInt();
		System.out.println("Enter the breadth:");
		breadth=sc.nextInt();	
	}
		
	public void Area()
	{
		
		Ar=length*breadth;
		System.out.println("Area of the rectangle is :"+Ar);
	}
	public void Peri()
	{ 
		Pm=2*(length+breadth);
		System.out.println("Perimeter of rectangle is:" +Pm);
		
	}
	
}
public class AreaIn
{
	public static void main(String args[])
	{
		int i=1,outpt;
		Scanner sc=new Scanner(System.in);
		Circle cp=new Circle();
		Rectangle rp=new Rectangle();
		while (i != 0) 
		{
            			System.out.print("\n--------------------------MENU------------------------------\n");
           			 System.out.println("\n1. Area of the circle\n2. Perimeter of the circle\n3. Area of the rectangle\n4. Perimeter of the rectangle\n5. Exit");
           	 		System.out.print("\n------------------------------------------------------------------\n");
           			 System.out.print("\n choose your option: ");
            			outpt = sc.nextInt();
            			switch (outpt)
			 {
            				case 1:
                				cp.Area();
                				break;
            				case 2:
                				cp.Peri();
                				break;
            				case 3:
               					 rp.Area();
                				break;
            				case 4:
                				rp.Peri();
                				break;
            				case 5:
                				i = 0;
                				System.out.print("\nExiting from the prgm.");
                				break;
            				default:
                				System.out.println("\nchoose a valid option");
            			}
            
        	}
    
		
		
}
}
