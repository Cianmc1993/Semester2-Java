import java.util.*;

public class stringsA7 
{
  
  
  public static void main(String[] args)
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    System.out.println("Please enter full name:");
    String name1 = keyboardIn.nextLine();
    
    int second = name1.indexOf(" ");
                 
    System.out.println(name1+" has "+name1.length() + " Letters");
    System.out.println("Initials are "+ name1.charAt(0)+name1.charAt(second+1));
    
    
   }
  
  
  
}