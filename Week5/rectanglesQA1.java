import java.util.*;
import java.awt.Rectangle;

public class rectanglesQA1
{
  
  
   public static void main(String[] args)
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    //Oblong rectangle = new Oblong();
    Rectangle rectangle = new Rectangle();
    Rectangle rectangle2 = new Rectangle();
    Rectangle rectangle3 = new Rectangle();
    int x =0;
    int y =0;
    rectangle.x = 15;
    rectangle.y = 35;
    rectangle.setSize(10,20);
    
    System.out.println("The x coordinate is: "+rectangle.x);
    System.out.println("The y coordinate is: "+rectangle.y);
    System.out.println("The height is: "+rectangle.getHeight());
    System.out.println("The width is: "+rectangle.getWidth());
    
   }
}