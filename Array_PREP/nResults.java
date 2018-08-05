import java.util.*;

public class nResults
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      System.out.println("Enter number of results: ");
      int n = keyboardIn.nextInt();
      
      double[] results = new double[n];
      
      for(int i=0;i<results.length;i++)
      {
         System.out.println("Enter result for exam number "+(i+1)+ ":");
         results[i] = keyboardIn.nextDouble();
      }
      
      int passCount=0;
      int failCount=0;
      double total=0;
      
      for(int i=0;i<results.length;i++)
      {
         total = total+results[i];  
      }
         double average = total/results.length;
         
         System.out.println("Average is :"+average);
      
      for(int i=0;i<results.length;i++)
      {
         if(results[i] >= 40)
         {
            passCount++;
         }
         
         if(results[i] <40)
         {
            failCount++;
         } 
      }
      
         System.out.println("Number of students that passed: "+passCount);
         System.out.println("Number of students that failed: "+failCount);
         
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
      
         System.out.println("Number of students above average: "+aboveAverage);
         System.out.println("Number of students below average: "+belowAverage);

      
      
   }
}
         
      
      
      
      
      
      
   