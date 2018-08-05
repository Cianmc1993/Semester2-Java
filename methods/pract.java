import java.util.Scanner;
public class pract
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int num1 , num2;
      
         System.out.println("Enter number 1: ");
         num1 = keyboardIn.nextInt();
         
         System.out.println("Enter number 2: ");
         num2 = keyboardIn.nextInt();
         
         if(isDivisable(num1,num2))
         {
            System.out.println(num1+" is divisable by "+num2);
         }
         else
            System.out.println(num1+" is not divisable by "+num2);
   }
   
      public static boolean isDivisable(int num1 , int num2)
      {
         return num1 % num2 == 0;                           
      }
}