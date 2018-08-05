
import java.util.*;

public class stringsA5 
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    System.out.println("Please enter the password:");
    String name1 = keyboardIn.nextLine();
    
                 
    if(name1.equals("Let me in"))
    
    System.out.println("Password correct");
    else 
    System.out.println("Incorrect password.");
    
    
   }
  
  
  
}