import java.util.Scanner;

class Person {
    String Name;
    String Gender;
    String Address;
    int Age;

    Person(String Name,String Gender,String Address,int Age)
    {
       this.Name=Name;
       this.Gender=Gender;
       this.Address=Address;
       this.Age=Age;

    }
}

class Employee extends Person {
    String Empid;
    String Company_Name;
    String Qualification;
    Double Salary;

    Employee(String Name,String Gender,String Address,int Age,String Empid,String Company_Name,String Qualification,Double Salary)
    {
        super(Name,Gender,Address,Age);
        this.Empid=Empid;
        this.Company_Name=Company_Name;
        this.Qualification=Qualification;
        this.Salary=Salary;
    }
}

class Teacher extends Employee
{
    String Subject;
    String Department;
    String TeacherId;

    Teacher(String Name,String Gender,String Address,int Age,String Empid,String Company_Name,String Qualification,Double Salary,String Subject,String Department,String TeacherId)
    {
        super(Name,Gender,Address,Age,Empid,Company_Name,Qualification,Salary);
        this.Subject=Subject;
        this.Department=Department;
        this.TeacherId=TeacherId;
    }

    void Display()
    {
        System.out.println("Person Name : " + Name);
        System.out.println("Person Gender : " + Gender);
        System.out.println("Person Address : " + Address);
        System.out.println("Person Age : " + Age);
        System.out.println(" Employee ID : " + Empid);
        System.out.println("Company Name : " + Company_Name);
        System.out.println("Employee Qualification : " + Qualification);
        System.out.println("Employee Salary : " + Salary);
        System.out.println("Teacher ID : " + TeacherId);
        System.out.println("Department : " + Department);
        System.out.println("Subject : " + Subject);
    }

}

public class MultilevelleInheritance
{
    public static void main(String[] args) 
    {
        int num;
        String sub,Dept,Teacherid,Empid,company_name,qualification,name,gender,Address;
        int age;
        Double Salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teachers : ");
        num = sc.nextInt();
        Teacher[] teacher = new Teacher[num];
        for (int i = 0; i < num; i++) 
        {
            System.out.println("\nEnter the Details of Teacher\n______________________________\n\n");
            System.out.println("Enter the Name : ");
            name = sc.next();
            System.out.println("\nEnter the Gender : ");
            gender =sc.next();
            System.out.println("\nEnter the Address : ");
            Address = sc.next();
            System.out.println("\nEnter the Age : ");
            age = sc.nextInt();
            System.out.println("\nEnter the Employee Id : ");
            Empid = sc.next();
            System.out.println("\nEnter the Company Name : ");
            company_name = sc.next();
            System.out.println("\nEnter the Qualification : ");
            qualification = sc.next();
            System.out.println("\nEnter the Salary : ");
            Salary = sc.nextDouble();
            System.out.println("\nEnter the Department : ");
            Dept = sc.next();
            System.out.println("\nEnter the Subject taught : ");
            sub = sc.next();
            System.out.println("\nEnter the Teacher Id : ");
            Teacherid =sc.next();
            teacher[i] = new Teacher(name,gender,Address,age,Empid,company_name,qualification,Salary,Dept,sub,Teacherid);
        }
        System.out.println("Details of Teachers : ");
        for (int i = 0; i < num; i++)
        {
            System.out.println();
            teacher[i].Display();
        }
    }

}
