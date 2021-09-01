 import java.util.*;
import java.time.*;
interface Bills
{
	public int BillAmounts();
	
}

class PurchaseBills 
{
	
	int ProductID,Quantity,UnitPrice,Total;
	String Name; 
	PurchaseBills()
	{
	
	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the product ID:");
	ProductID=sc.nextInt();
	System.out.println("Enter the quantity:");
	Quantity=sc.nextInt();
	System.out.println("Enter the unit price:");
	UnitPrice=sc.nextInt();
	System.out.println("Enter the name:");
	Name=sc.next();
	}
	
	
	 void Displays(int OrderNo,int netamount,PurchaseBills b[])
	{
		System.out.println("\n__________________________________________________________________________________________\n");
		System.out.println("\nOrderNo:"+OrderNo);
		System.out.println("\nDate : "+ LocalDate.now());
		System.out.println("\n ProductID\tName\tQuantity\tUnitPrice\tTotal\n"); 
		System.out.println("-----------------------------------------------------------------------");
		for(int i=0;i<b.length;i++){
		System.out.println(b[i].ProductID +"\t\t"+b[i].Name+"\t"+b[i].Quantity+"\t\t "+b[i].UnitPrice+"\t\t"+b[i].Total);
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("\t\t\t\t\tNetAmount       "+ netamount);
	}
	public int BillAmounts(int netamount)
	{
	Total=Quantity*UnitPrice;
	netamount+=Total;
	return netamount;
	}
	
}
public class CustomerBill
{		
	public static void main(String args[])
	{
		int i,n,netamount=0,OrderNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order number:");
		OrderNo=sc.nextInt();
		System.out.println("Enter the no of products purchased:");
		n=sc.nextInt();
		
		PurchaseBills b[]=new PurchaseBills[n];
		 
		for( i=0;i<n;i++)
		{
			 
			b[i]=new PurchaseBills();
			netamount=b[i].BillAmounts(netamount);
			
			
			
			
		}
		
		b[0].Displays(OrderNo,netamount,b);
		
	}
} 
  