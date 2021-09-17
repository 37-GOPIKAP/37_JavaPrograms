//Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface) 
import java.util.Scanner;
class EvenFib{
   int count=0;
   synchronized void fibonacci(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the limit for fibonacci series:");
     int n=sc.nextInt();
     System.out.println("the first " +n+ " terms of the fibonacci sequence is:");
     System.out.println(0);
     System.out.println(1);
     int a=0;
     int b=1;
     int c;
     while(count<(n-2))
{
        c=a+b;
        System.out.println(c);
        count=count+1;
        a=b;
        b=c;
        try{
           Thread.sleep(500);     
        }catch(Exception e)
          {
          System.out.println(e);
          }
    }
   } 
   synchronized void even()
{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the limit for even numbers:");
       int n=sc.nextInt();
       int count=0;
       System.out.println("First " +n+ " even numbers are:");
         for(int i=1;count<n;i++)
{
           if(i%2==0){
             count++;
             System.out.println(i);
           }
      }
    }
 }
class FibNum implements Runnable
{
    EvenFib f;
     FibNum(EvenFib f)
{
         this.f=f;
    }
    public void run(){
        f.fibonacci();
     }
}
class EvenNum implements Runnable
{
     EvenFib f;
      EvenNum(EvenFib f)
{
          this.f=f;
       }
       public void run(){
           f.even();
      }
}
public class RunnableInterface
{
     public static void main(String args[])
{
          EvenFib ef=new EvenFib();
          FibNum f=new FibNum(ef);
          EvenNum en=new EvenNum(ef);
          Thread td1=new Thread(f);
          Thread td2=new Thread(en);
           td1.start();
           td2.start();
  }

}
