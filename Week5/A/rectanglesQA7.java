import java.util.*;
import java.awt.Rectangle;

public class rectanglesQA7
   {
  
  
  public static void main(String[] args) { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    //Oblong rectangle = new Oblong();
    Rectangle rectangle3 = new Rectangle();
    
    System.out.print("Please enter position x for rectangle3: ");
    rectangle3.x = keyboardIn.nextInt();
    System.out.print("Please enter position y for rectangle3: ");
    rectangle3.y = keyboardIn.nextInt();

    rectangle3.translate(50,-70);
    
    System.out.println(rectangle3.toString());
    
   }
}