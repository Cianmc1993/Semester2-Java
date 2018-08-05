import java.util.*;

public class stringsB1 
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    System.out.println("Please enter a string of text:");
    String name1 = keyboardIn.nextLine();
    
    System.out.println("Please enter char to replace:");
    char toRep = keyboardIn.next().charAt(0);
    
    System.out.println("Please enter replacement char:");
    char willRep = keyboardIn.next().charAt(0);
    
    name1 = name1.replace(toRep , willRep);
   
                 
    System.out.println(name1);
    
    
   }
  
  
  
}