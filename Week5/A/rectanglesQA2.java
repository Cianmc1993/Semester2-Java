import java.util.*;
import java.awt.Rectangle;

public class rectanglesQA2
   {
  
  
  public static void main(String[] args) { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    
    //Oblong rectangle = new Oblong();
    Rectangle rectangle2 = new Rectangle();
    int x = 0;
    int y = 0;
    
    System.out.print("Please enter position x for rectangle2: ");
    rectangle2.x = keyboardIn.nextInt();
    System.out.print("Please enter position y for rectangle2: ");
    rectangle2.y = keyboardIn.nextInt();
    System.out.print("Please enter height for rectangle2: ");
    x = keyboardIn.nextInt();
    System.out.print("Please enter width for rectangle2: ");
    y = keyboardIn.nextInt();
    rectangle2.setSize(x,y);
    
    double area = rectangle2.getWidth() * rectangle2.getHeight();
    double perimeter = rectangle2.getWidth() * 2 + rectangle2.getHeight() * 2;
    
    System.out.println("The x coordinate is: "+rectangle2.x);
    System.out.println("The y coordinate is: "+rectangle2.y);
    System.out.println("The width is: "+rectangle2.getWidth());
    System.out.println("The height is: "+rectangle2.getHeight());
    System.out.println("The area is: "+area);
    System.out.println("The perimeter is: "+perimeter);
    System.out.println(rectangle2.toString());
    rectangle2.grow(5,12);
    System.out.println(rectangle2.toString());
    
   }
}