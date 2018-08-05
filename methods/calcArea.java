import java.util.Scanner;
public class calcArea
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double r;
      double area;
      
      System.out.println("Enter radius :" );
      r = keyboardIn.nextDouble();
      
      //area = calcArea(r);
      
      System.out.println(calcArea(r));
      
   }
   
   public static double calcArea(double r)
   {
      return 3.142 * r * r;
   }
}
      