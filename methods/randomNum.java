import java.util.*;
public class randomNum
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      Random noGenerator = new Random();
      
      int num1 , num2;
      
      System.out.println("Type in first number ");
      num1 = keyboardIn.nextInt();
      
      System.out.println("Type in second number ");
      num2 = keyboardIn.nextInt();
      
      System.out.println(getRandomInt(num1,num2));
   }
   
   public static int getRandomInt(int num1 , int num2)
   {
      Random noGenerator = new Random();
      
      int random = noGenerator.nextInt(num2)+num1;
      
      return random;
   }
   
}

