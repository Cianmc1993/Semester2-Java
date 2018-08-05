import java.util.*;

public class stringsA6 
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    System.out.println("Please enter first name:");
    String name1 = keyboardIn.nextLine();
    
    System.out.println("Please enter last name:");
    String name2 = keyboardIn.nextLine();
    
                 
    System.out.println(name1.charAt(0) +"  "+ name2.charAt(0));
    
    
   }
  
  
  
}