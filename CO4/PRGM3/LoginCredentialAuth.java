// Write a user defined exception class to authenticate the user name and password.
import java.util.*;
class LoginUsername extends Exception
{
    LoginUsername(String s)
    {
        super(s);
    }
}
class LoginPassword extends Exception
{
    LoginPassword(String s)
    {
        super(s);
    }
}
class LoginCredentialAuth
{
    public static void main(String args[])
 {
        
        String username,password;
           try
{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the username:");
                username=sc.nextLine();
                System.out.println("Enter the password:");
                password=sc.nextLine();
                if(!username.equals("Gopika8299"))
                    throw new LoginUsername ("Incorrect Username.Please enter valid username!");
                else if(!password.equals("Premaprabhu@123"))               
                     throw new  LoginPassword ("Incorrect password.Please enter a valid password!");
                else
                     System.out.println("\t\t\tSuccessfully logged in......!!");
                }
                 catch(LoginUsername e){
                        System.out.println(e);
                  }
                  catch(LoginPassword e){
                         System.out.println(e);
                  }
                 finally{
                       System.out.println("\n \n Program ends....!!");
}
}
}
