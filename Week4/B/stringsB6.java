import java.util.*;

public class stringsB6 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    
 
      
      System.out.println("Please enter first String:");
      String name1 = keyboardIn.nextLine();
      
      System.out.println("Please enter second String:");
      String name2 = keyboardIn.nextLine();
      
      
      
    
    if(name1.contains(name2))
    System.out.println(name1 +" contains the text "+name2);
    
    if(name1.startsWith(name2))
    System.out.println(name1 +" starts with "+name2);
   
    if(name1.endsWith(name2))
    System.out.println(name1 +" ends with "+name2);
    
   }
  
  
  
}