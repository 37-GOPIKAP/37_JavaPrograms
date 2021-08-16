import java.util.Scanner;
interface Student
{
	public void StudentDetails();
	
}
interface Sports
{
	public void StudentDetailsSp();
	
}
class Result implements Student ,Sports 
{
	
	int reg_no,age, classstd,max,total_marks,sport_score,height,weight;
	String name,sports_item;
	Result()
	{
		StudentDetails();
		StudentDetailsSp();	
	}
	Scanner sc=new Scanner(System.in);
	public void StudentDetails()
	{
		System.out.println("student details");
		System.out.println("Enter the student id:");
		reg_no=sc.nextInt();
		System.out.println("Enter the student name:");
		name=sc.next();
		System.out.println("Enter the age of student:");
		age=sc.nextInt();
		System.out.println("studying in:" );
		classstd=sc.nextInt();
		System.out.println("sport item:" );
		sports_item=sc.next();
		System.out.println("Enter the maximum marks:");
		max=sc.nextInt();
		System.out.println("Enter the mark obtained:");
		total_marks=sc.nextInt();
		
	}
	public void StudentDetailsSp()
	{
		System.out.println("height of student:" +height);
		height=sc.nextInt();
		System.out.println("weight of student:" +weight);
		weight=sc.nextInt();
		System.out.println("Enter the score obtained in sports meet:");
		sport_score=sc.nextInt();
	}
	
	void DisplayStDetails()
	{
		System.out.println("\n---------------------------------------------------\n");
		System.out.println("Student name:" +name);
		System.out.println("Student ID:" +reg_no);
		System.out.println("Marks obtained in academics:" +total_marks);
		System.out.println("Score obtained in sports:" +sport_score);
	}

}	
	
public class MultipleInheritance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Result st= new Result();
		
		st.DisplayStDetails();
	}
}  
