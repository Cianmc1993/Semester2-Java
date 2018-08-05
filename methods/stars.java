import java.util.*;
public class stars
{
   public static void main(String[] args)
   {
   Scanner keyboardIn = new Scanner(System.in);
   
   System.out.println("Enter number of stars :");
   int num = keyboardIn.nextInt();
   
   displayStars(num);
   
   System.out.println("Enter grade :");
   int grade = keyboardIn.nextInt();
   
   if(validGrade(grade))
   {
      System.out.println("Valid");
   }
   else
      System.out.println("Invalid");
   
   System.out.println("Enter result :");
   int result = keyboardIn.nextInt();
   
   System.out.println(star(result));
   
   System.out.println("Enter exam result: ");
   int exam = keyboardIn.nextInt();
   
   if(validGrade(exam))
   {
      displayStars(exam);
   }
   else
      System.out.println("Invalid");

   
   }
   
   public static void displayStars(int num)
   {
      for(int i =0;i < num;i++)
      {
         System.out.println("*");
      }
   }
   
   public static boolean validGrade(int grade)
   {
      if(grade >= 0 && grade <= 100)
         return true;
         
      else
         return false;
   }
   
   public static int star(int result)
   {
      if(result >= 0 && result <= 10)
         return 0;
      else if(result >= 11 && result <= 20)
         return 1;
      else if(result >= 21 && result <= 30)
         return 2;
      else if(result >= 31 && result <= 40)
         return 3;
      else if(result >= 41 && result <= 50)  
         return 4;
      else if(result >= 51 && result <= 60) 
         return 5;
      else if(result >= 61 && result <= 70)
         return 6;
      else if(result >= 71 && result <= 80)
         return 7;
      else if(result >= 81 && result <= 90)
         return 8;
      else if(result >= 91 && result <= 100)
         return 9;
      else
         return 0;
   }
}