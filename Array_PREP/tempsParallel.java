import java.util.*;

public class tempsParallel
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int choice=0;
      
      String[] days = {"Monday" , "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
      
      double[] temps = {10.5 , 15.0 , 20.0 , 9.0 , 16.5 , 27.5 , 19.0};
      
      System.out.println("Enter day of the week :");
      choice = keyboardIn.nextInt();
      
            
      System.out.println("On "+days[choice-1]+" it was "+temps[choice-1]+" degrees");
      
      int hotterCount=0;
      int colderCount=0;
      double average=0;
      double total=0;
      
      for(int i=0; i<days.length;i++)
      {
         {
         total = total + temps[i];
         }
         average = total/days.length;
      }
         System.out.println("Average degrees is "+average);
         
      for(int i=0; i<days.length;i++)
      {
         if(temps[i] > average)
         {
            hotterCount++;
         }
         if(temps[i] < average)
         {
            colderCount++;
         }
      }
         System.out.println("Days below average "+colderCount);
         System.out.println("Days above average "+hotterCount);
       
   }
}
         
