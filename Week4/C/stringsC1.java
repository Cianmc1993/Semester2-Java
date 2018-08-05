import java.util.*;

public class stringsC1 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    boolean probe = true;
    String name1;
    
 
   
     System.out.println("Please input string:");
     name1 = keyboardIn.nextLine();
   
      for(int i = name1.length()-1; i>-1; i--)
      {
        System.out.print(name1.charAt(i));    
      }
  }
  
  
  
}