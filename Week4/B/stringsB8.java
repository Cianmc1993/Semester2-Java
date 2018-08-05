import java.util.*;

public class stringsB8 
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    boolean probe = true;
    String name1;
    
 
    do{
      System.out.println("Please input phone number:");
      name1 = keyboardIn.nextLine();
      
      if(name1.length() != 14)
      System.out.println("Please enter a valid phone number.");
     
    }while(name1.length() != 14); 
    
    String countryCode = name1.substring(0,5);
    String areaCode = name1.substring(5,7);
    String exchangeNumber = name1.substring(7,name1.length());
    
    System.out.println(countryCode +"  "+areaCode+"  "+exchangeNumber);
   }
  
  
  
}