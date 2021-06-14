 import java.util.Scanner;
class NoElmt
{
public static void main(String[]args)
{
int i,n,j=0,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements of an array");
n=sc.nextInt();
int a[]=new int[n];
int rev[]=new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
count=count+1;
}
System.out.println(" The no.of elements in the array is:");
System.out.println(count);
}
}
