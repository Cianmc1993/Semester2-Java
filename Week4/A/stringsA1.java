import java.util.*;

public class stringsA1 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    System.out.println("Please enter your name:");
    String name = keyboardIn.nextLine();
    
    System.out.println(name + " contains "+ (name.length())  +" letters.");
    
    
    
  }
  
  
  
}