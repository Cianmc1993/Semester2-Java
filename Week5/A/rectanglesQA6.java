import java.util.*;
import java.awt.Rectangle;

public class rectanglesQA6
   {
  
  
  public static void main(String[] args) { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    //Oblong rectangle = new Oblong();
    Rectangle rectangle3 = new Rectangle();  
    rectangle3.setSize(20,10);
   
   
      
      
       System.out.println("Please enter position x for rectangle3: ");
       rectangle3.x = keyboardIn.nextInt();
       System.out.println("Please enter position y for rectangle3: ");
       rectangle3.y = keyboardIn.nextInt();
       if(rectangle3.contains(5,8))System.out.println("The rectangle does contain the point (5,8)");
       else System.out.println("The rectangle does not contain the point (5,8)");
       
   }
}