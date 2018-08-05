import java.util.*;

public class stringsC3 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    boolean probe = true;
    String name1;
    String[] words = new String[10];
    
    
      for(int i=0;i<10;i++)
      {
        System.out.println("Please input string:");
        words[i] = keyboardIn.nextLine();      
      }
      
      for(int i=0;i<10;i++)
      {
        System.out.println(words[i]+ " "+i);      
      }
   
      
   }
  
  
  
}