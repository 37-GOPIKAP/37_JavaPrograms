//Java program to print the elements in an array
import java.util.Scanner;
class Arrayelemt
{
public static void main(String[]args)
{
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements of an array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("array elements are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
