import java.util.*;

public class results
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int[] results = new int[5];
      
      for(int i=0; i<results.length;i++)
      {
         System.out.println("Enter results for student "+(i+1));
         results[i] = keyboardIn.nextInt();
         
          if(results[i] < 0 || results[i] > 100)
          {
          System.out.println("Invalid result");
          
          System.out.println("Please enter valid result between 0 and 100 :");
          results[i] = keyboardIn.nextInt();
          }
      }         
         
         
         int highest =results[1];
         int lowest =results[1];
         
         for(int i=0;i<results.length;i++)
         {
            if(results[i] > highest)
            highest = results[i];
            
            if(results[i] < lowest)
            lowest = results[i];

         }
            System.out.println("Highest "+highest);
            System.out.println("Lowest "+lowest);
            
         int total =0;
         
         for(int i=0;i<results.length;i++)
         {
            total=total +results[i];
         }
            double average = total/results.length;
            System.out.println(average);
            
            int aboveAverage=0;
            int belowAverage=0;
           
         for(int i=0;i<results.length;i++)
         {
            if(results[i] < average)
            {
               belowAverage++;
            }
            
            if(results[i] > average)
            {
               aboveAverage++;
            }
         }
            
            System.out.println("Students above average: "+aboveAverage);
            System.out.println("Students below average: "+belowAverage);
            
         
         
   }     
}