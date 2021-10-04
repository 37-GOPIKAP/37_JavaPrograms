  
import java.util.Scanner;

class Publisher
{
    String Publisher_name;

    Publisher(String name)
{
        Publisher_name=name;
    }
    void Display()
{
        System.out.println("Publisher name : "+Publisher_name);
    }
}

class Book extends Publisher{
    String Book_name;
    Book(String pname,String bname)
{
        super(pname);
        Book_name=bname;
    }
    void Display()
{
        super.Display();
        System.out.println("Book name : "+Book_name);
    }
}

class Literature extends Book
{
    String Literature_name;
    Literature(String pname,String bname,String lname)
{
        super(pname,bname);
        Literature_name=lname;
    }
    void Display()
{
        super.Display();
        System.out.println("Literature name : "+Literature_name);
    }
}

class Fiction extends Book
{
    String Fiction_name;
    Fiction(String pname,String bname,String fname)
{
        super(pname,bname);
        Fiction_name=fname;
    }
    void Display()
{
        super.Display();
        System.out.println("Fiction name : "+Fiction_name);
    }
}

public class Library
{
    public static void main(String[] args) 
{
        Scanner sc=new Scanner(System.in);

        String lpubname,lbokname,Authname;
        String fpubname,fbokbname,Authfictname;

        System.out.println("-----Literature-----");
        System.out.println("Enter publisher name : ");
        lpubname=sc.nextLine();
        System.out.println("Enter Book name : ");
        lbokname=sc.nextLine();
        System.out.println("Enter author name : ");
        Authname=sc.nextLine();
        System.out.println();

        System.out.println("-----Fiction-----");
        System.out.println("Enter publisher name : ");
        fpubname=sc.nextLine();
        System.out.println("Enter Book name : ");
        fbokbname=sc.nextLine();
        System.out.println("Enter author name : ");
        Authfictname=sc.nextLine();
        System.out.println();

        Literature objL=new Literature(lpubname, lbokname, Authname);
        objL.Display();
        System.out.println();
        Fiction objE=new Fiction(fpubname, fbokbname, Authfictname);
        objE.Display();
    }
}