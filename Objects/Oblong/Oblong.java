/**
	An Oblong has a width and a height
*/
import java.util.*;
import java.lang.Math;


public class Oblong
{
   //Instance variables
   private double width;
   private double height;

   public double getWidth()
   {
      return width;
   }

   public double getHeight()
   {
      return height;
   }

   public void setWidth(double widthIn)
   {
      width = widthIn;
   } 

 
   public void setHeight(double heightIn)
   {
      height = heightIn;
   }
   
   
   public double calculateArea()
   {
      return width * height;
   }
   
   public void calculatePerimeter()
   {
      System.out.println("The height is: "+getHeight());
      System.out.println("The width is: "+getWidth());
   }
    
       
   public boolean isSquare()
   {
      if(getHeight()==getWidth())
      return true;
      else 
      return false;
      
   }
   
   public void resizePerimeter(Scanner keyboardIn)
   {
      System.out.println("Increase/Decrease height by:");
      double height = keyboardIn.nextDouble();
      setHeight(getHeight()+height);
      System.out.println("Increase/Decrease width by:");
      double width = keyboardIn.nextDouble();
      setWidth(getWidth()+width);
   }
    
    public void calculateHypothenuse()
   {
      double hypo = java.lang.Math.pow((java.lang.Math.pow(getWidth(),2) + java.lang.Math.pow(getHeight(),2)), 0.5);
      System.out.println("The diagonal is: "+hypo);
   }
 
}

