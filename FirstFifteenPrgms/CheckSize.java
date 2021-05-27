public class CheckSize
{
  public static void main(String[] args) 
  {

    int n = 44;
    String str;
    switch (n)
    {

      case 29:
        str = "Small";
        break;

      case 42:
        str= "Medium";
        break;
        
      case 44:
        str = "Large";
        break;

      case 48:
        str= "Extra Large";
        break;
      
      default:
        str= "Unknown";
        break;

    }
    System.out.println("Size: " + str);
  }
}