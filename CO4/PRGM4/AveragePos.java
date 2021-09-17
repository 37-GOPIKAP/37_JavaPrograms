// Find the average of N positive integers, raising a user defined exception for each negative input
import java.util.Scanner;
class Negative extends Exception
{
Negative (String s)
{
    super(s);
}
}
class AveragePos
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float avg;
        int sum=0;
        int num;
        System.out.println("Enter the range of numbers : ");
        int count=sc.nextInt();
        try{             
            System.out.println("Enter the elements : ");
            for(int i=0;i<count;i++)
            {
                num=sc.nextInt();
                if(num < 0)
                {
                    throw new Negative("Invalid input!!Enter positive number.");
                }
                else
                {
                    sum=sum+num;
                }
            }
            avg=(float)sum/count;
            System.out.println("Sum of " +count+ " numbers is:"+sum);
            System.out.println("Average of "+count+ " number is :"+String.format("%.2f",avg));
        }
        catch(Negative e){
            System.out.println(e);
        }
        finally{
          System.out.println("\nProgram ends!!");
}

}
}
