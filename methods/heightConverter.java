import java.util.*;
public class heightConverter
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      System.out.println("Enter height in inches: ");
      double inch = keyboardIn.nextDouble();
      
      System.out.println("Your height in metres: "+convert(inch));
      
   }
   
   public static double convert(double inch)
   {
      double metres = inch * 0.0254;
      
      return metres;
   }
   
}