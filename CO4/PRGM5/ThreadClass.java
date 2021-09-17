//Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. 
import java.lang.*;
import java.util.*;
class Multiplication extends Thread
{
public void run()
{
    for(int i=1;i<=10;i++)
    {
        System.out.println(i+" * 5 = "+(i*5));
        
    }
    try{  
        Thread.sleep(700);  
       }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
    
}
class PrimeNum extends Thread
{
int num;

public void run()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of prime numbers need to display : ");
    int n=sc.nextInt();
    System.out.println("_______PRIME NUMBERS_______");
    for(int i=2;i<100;i++)
    {
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if (i%j==0)
            {
                count=count+1;
            }

        }
        if(count==2)
        {
            System.out.println(i+ "  ");
            num=num+1;

        }
        if (num==n)
        {
        break;
        }
    }
    try{  
        Thread.sleep(1000);  
       }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
public class ThreadClass
{
    public static void main(String args[])
 {
    Multiplication Multi=new Multiplication();
    PrimeNum Prime=new PrimeNum();
    Multi.start();
    Prime.start();
    }
}
