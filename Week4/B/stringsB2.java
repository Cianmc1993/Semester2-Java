import java.util.*;

public class stringsB2
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    boolean password = true;    
    do{
    
       System.out.println("Please enter password:");
       String name1 = keyboardIn.nextLine();
       
       if(name1.equals("open Sesame"))
       {
         System.out.println("Password correct!");
         password = false;
       }
       else 
       System.out.println("Password wrong!");
       
       }while(password);
       
        System.out.println("Thank you Goodbye");
   }
}
       
       