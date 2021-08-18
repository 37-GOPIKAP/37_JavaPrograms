import java.util.Scanner;
 
public class AddingTwoMatrices
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
 int i,j,row,col,sum=0;
 System.out.println("Enter the number of rows:");
 row = sc.nextInt();
 System.out.println("Enter the number of columns:");
 col = sc.nextInt();
 
 int[][] matrix1 = new int[row][col];
 int [][] matrix2 = new int[row][col];
 
     System.out.println("Enter the elements of the first matrix") ;
     for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
          matrix1[i][j] = sc.nextInt();
     }
 }
 
     System.out.println("Enter the elements of the second matrix") ;
     for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
          matrix2[i][j] = sc.nextInt();
     }
 }
 
     System.out.println("The elements of matrix1 are") ;
     for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
        System.out.print(matrix1[i][j]+"\t");
     }
       System.out.println("");
 }
 
     System.out.println("The elements of matrix2 are") ;
     for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
        System.out.print(matrix2[i][j]+"\t");
     }
       System.out.println("");
 }
     
 System.out.println("\nThe SUM of elements of matrix1 and matrix2 are") ;
     for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
 sum = matrix1[i][j] + matrix2[i][j];
        System.out.print(sum+"\t");
     }
       System.out.println("");
 }
  	} 
}
