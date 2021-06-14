//Java program to display the array elements in reverse order
import java.util.Scanner;
class ArrayRevOrd
{
public static void main(String[]args)
{
int i,n,j=0;
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

for(i=n-1;i>=0;i--)
{
rev[j]=a[i];
j++;
}
System.out.println(" reverse array elements are");
for(i=0;i<n;i++)
{
System.out.println(rev[i]);
}
}
}
