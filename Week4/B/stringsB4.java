import java.util.*;

public class stringsB4 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    
 
      
      System.out.println("Please enter string1:");
      String name1 = keyboardIn.nextLine();
      
      System.out.println("Please enter string2:");
      String name2 = keyboardIn.nextLine();
      
      name1 = name1+name2;
      
    
    System.out.println(name1);
  }
  
  
  
}