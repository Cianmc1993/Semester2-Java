import java.util.*;
public class bmiCalculator
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      
      System.out.println("Enter height: ");
      double inch = keyboardIn.nextInt();
      
      System.out.println("Enter weight: ");
      double pounds = keyboardIn.nextInt();
      
      double heightConverted = heightConvert(inch);
      double weightConverted = weightConvert(pounds);
      
      System.out.println(heightConverted);
      System.out.println(weightConverted);
      
      System.out.println("Your bmi is :"+bmi(weightConverted,heightConverted
      ));
      
      
            
   }
   
   public static double heightConvert(double inch)
   {
      double metres = inch * 0.0254;
      
      return metres;
   }
   
   public static double weightConvert(double pounds)
   {
      double kilos = pounds * 0.453;
      
      return kilos;
   }
   
   public static double bmi(double kilo , double metres)
   {
      double bmi = kilo / (metres*metres);
      
      return bmi;
   }
}

      

      
   
