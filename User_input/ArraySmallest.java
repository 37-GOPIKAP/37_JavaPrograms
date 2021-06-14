//Java program to display the smallest element in an array
import java.util.Scanner;
class ArraySmallest
{
public static void main(String[]args)
{
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements of an array");
n=sc.nextInt();
int a[]=new int[n];
int rev[]=new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int min=a[0];
for(i=0;i<n;i++)
{
if(min>a[i])
{
min=a[i];
}
}
System.out.println("smallest element in the array elements:\n"+min);
}
}