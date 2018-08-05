import java.util.*;

public class stringsC2 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    boolean probe = true;
    String name1;
    String firstHalf="";
    String secondHalf="";
    
 
   
     System.out.println("Please input string:");
     name1 = keyboardIn.nextLine();
   
      for(int i=name1.length()-1;i>-1;i--)
      {
        firstHalf += name1.charAt(i);    
      }

      for(int i=0;i<name1.length();i++)
      {
        secondHalf += name1.charAt(i);    
      }

      if(firstHalf.equals(secondHalf))
      System.out.println("It's a palim palim!");
      else 
      System.out.println("It's no palim palim!");
  }
  
  
  
}