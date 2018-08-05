import java.util.*;

public class stringsA4 
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    System.out.println("Please enter name 1:");
    String name1 = keyboardIn.nextLine();
    
                 
    
    System.out.println("First letter is "+name1.charAt(0));
    System.out.println("Last letter is "+name1.charAt(name1.length()-1));
    
    
    
   }
  
  
  
}