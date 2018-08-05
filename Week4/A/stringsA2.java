import java.util.*;

public class stringsA2 
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
   
    
    System.out.println("Please enter name 1:");
    String name1 = keyboardIn.nextLine();
    
    System.out.println("Please enter name 2:");
    String name2 = keyboardIn.nextLine();
    
    if(name2.length()>name1.length())
    name1 = name2;                 
    
    System.out.println(name1 + " is the longer string as it contains "+ (name1.length())  +" letters .");
    
    
    
  }
  
  
  
}