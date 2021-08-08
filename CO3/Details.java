import java.util.Scanner;

class Employee {
    String Empid;
    String Name, Address;
    double Salary;

    Employee(String Empid,String Name,String Address,double Salary)
    {
        this.Empid = Empid;
        this.Name = Name;
        this.Address = Address;
        this.Salary = Salary;
        
    }
}

class Teacher extends Employee {
    String Department;
    String Subjects_taught;

    Teacher(String Department, String Subjects_taught, String Empid, String Name, String Address, double Salary) 
    {
        super(Empid, Name, Address, Salary);
        this.Department = Department;
        this.Subjects_taught = Subjects_taught;
        
    }

    void Display() {
        System.out.println("Employee Id : " + Empid);
        System.out.println("Employee Name : " + Name);
        System.out.println("Employee Salary : " + Salary);
        System.out.println("Employee Address : " + Address);
        System.out.println("Depaertment : " + Department);
        System.out.println("Subjects : " + Subjects_taught);
        
    }
} 
public class Details {
    public static void main(String[] args) {
        int num;
        String Eid, name, Add, Dept,sub;
        Double salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teachers : ");
        num = sc.nextInt();
        Teacher[] teacher = new Teacher[num];
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter the Employee Id : ");
            Eid = sc.next();
            System.out.println("Enter the Employee Name : ");
            name = sc.next();
            System.out.println("Enter the Employee Address : ");
            Add = sc.next();
            System.out.println("Enter the Salary : ");
            salary = sc.nextDouble();
            System.out.println("Enter the Department : ");
            Dept = sc.next();
            System.out.println("Enter the Subjects taught  : ");
            sub=sc.next();
            teacher[i] = new Teacher(Dept, sub, Eid, name, Add, salary);
        }
        System.out.println("Details of Teachers : ");
        for (int i = 0; i < num; i++) {
            System.out.println();
            teacher[i].Display();
        }
    }

}