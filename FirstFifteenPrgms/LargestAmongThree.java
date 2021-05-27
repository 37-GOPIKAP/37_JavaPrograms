public class LargestAmongThree
{

  public static void main(String[] args) 
  {

      int n1 = 19, n2 = 99, n3 = 2;

      if( n1 >= n2 && n1 >= n3)
          System.out.println(n1+" is the largest Number");

      else if (n2 >= n1 && n2 >= n3)
          System.out.println(n2+" is the largest Number");

      else
          System.out.println(n3+" is the largest Number");
  }
}