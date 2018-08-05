/**
	An Oblong has a width and a height
*/
import java.util.*;
import java.lang.Math;


public class Oblong
{
    // the attributes are declared first
   private double width;
   private double height;

    // then the methods
	
	
    // the next method allows us to get the width attribute
	 /**
		Gets the width of the oblong
		@return  the width
	*/
   public double getWidth()
   {
      return width;
   }

    // the next method allows us to get the height attribute
	 /**
		Gets the height of the oblong
		@return  the height
	*/
   public double getHeight()
   {
      return height;
   }

    // the next method allows us to set to the width attribute
	 /**
		Sets the width of the oblong.
		@param widthIn the length
	*/
   public void setWidth(double widthIn)
   {
      width = widthIn;
   } 

    // the next method allows us to set to the height attribute
	  /**
		Sets the height of the oblong.
		@param heightIn the height
	*/

   public void setHeight(double heightIn)
   {
      height = heightIn;
   }

    // this method returns the area of the oblong
	  /**
		Calculates the area of the oblong
		@return  the area of the oblong
	*/

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

