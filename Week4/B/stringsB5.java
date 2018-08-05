import java.util.*;

public class stringsB5 
{
  
  
   public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    
 
      
      System.out.println("Please enter string1:");
      String name1 = keyboardIn.nextLine();
      
      System.out.println("Please enter string2:");
      String name2 = keyboardIn.nextLine();
      
      if(name1.contains(name2)){
      System.out.println(name1 +" contains the text "+name2);
      }
      else
      System.out.println("Does not contain any text");
      
   }
  
  }
  
}
