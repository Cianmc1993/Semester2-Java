import java.util.*;
import java.awt.Rectangle;

public class OblongTester 
{
  
  
   public static void main(String[] args) 
   { 
    
    Scanner keyboardIn = new Scanner(System.in);
    
    Oblong oblong = new Oblong();
    Oblong oblong2 = new Oblong();
    
    double widthOb;
    double heightOb;
       
    System.out.print("Enter the width: ");
    widthOb = keyboardIn.nextDouble();
    oblong.setWidth(widthOb);
    
    System.out.print("Enter the height: ");
    heightOb = keyboardIn.nextDouble();
    oblong.setHeight(heightOb);
    
    oblong2.setWidth(10);
    oblong2.setHeight(10);
    
    if(oblong.calculateArea() > oblong2.calculateArea())
    {
      System.out.println("Oblong is bigger , the height is "+oblong.getHeight()+ " and the width is "+oblong.getWidth());
    }
    else if(oblong2.calculateArea() > oblong.calculateArea())
    {
      System.out.println("Oblong2 is bigger , the height is "+oblong2.getHeight() +" and the width is "+oblong2.getWidth());
    }
    else
      System.out.println("Oblongs are same size");
      
    System.out.println("Area: "+oblong.calculateArea());
    
    System.out.println("Oblong is a square: "+oblong.isSquare());
    
    oblong.calculatePerimeter();
    oblong.resizePerimeter(keyboardIn);
    oblong.calculatePerimeter(); 
    
    oblong.calculateHypothenuse();    
    
    
   }
}