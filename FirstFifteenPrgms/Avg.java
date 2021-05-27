public class Avg
{
  public static void main(String arg[])
  {
    int n=5,avg=0 ,sum=0;
 
    int a[]={110,120,130,140,150};
 
    for(int i=0;i<n;i++)
    {
    sum=sum+a[i];
    }
    avg=sum/n;
 
    System.out.println("sum ="+ sum);
    System.out.println("average ="+ avg);
  
  }
}