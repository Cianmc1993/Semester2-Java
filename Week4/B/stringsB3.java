import java.util.*;

public class stringsB3
{
  
  
  public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    
      for(int i=0;i<3;i++){ 
    
       System.out.println("Please enter password:");
       String name1 = keyboardIn.nextLine();
       
       if(name1.equals("open sesame")){
         System.out.println("Password correct!");
         break;
       }
       else{
       System.out.println("Password wrong!");
       }
      }
       
        System.out.println("Goodbye");
   }

}
