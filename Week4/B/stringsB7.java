import java.util.*;

public class stringsB7 
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    
 
      
      System.out.println("Please enter first String:");
      String name1 = keyboardIn.nextLine();
      
      System.out.println("Please enter second String:");
      String name2 = keyboardIn.nextLine();
      
      for(int i=0;i<name1.length();i++){
        if(name1.charAt(0)<name2.charAt(0)){
           System.out.println(name1+" comes before "+name2);
           break;
        }
        
        else if(name1.charAt(0)>name2.charAt(0))
        {
           System.out.println(name2+" comes before "+name1);
           break;
        }
      }
    
  }
  
  
  
}