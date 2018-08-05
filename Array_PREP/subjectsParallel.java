import java.util.*;

public class subjectsParallel
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String[] subjects = new String[6];
      int[] results = new int[6];
      
      int pass=0;
      int fail=0;
      
      for(int i=0;i<subjects.length;i++)
      {
         System.out.println("Enter subject "+(i+1)+":");
         subjects[i] = keyboardIn.nextLine();
      }
      
      for(int i=0;i<results.length;i++)
      {
         System.out.println("Enter result "+(i+1)+":");
         results[i] = keyboardIn.nextInt();
      }
      
      System.out.println("Your results are");
         
      for(int i=0;i<results.length;i++)
      {  
         System.out.println(subjects[i]+ "\t\t\t\t\t"+results[i]);
      }
         
          
      for(int i=0;i<results.length;i++)
      {
         if(results[i] < 40)
         {
            pass++;
         }
         
         if(results[i] >= 40)
         {
            fail++;
         }  
      }
         System.out.println("Number of passes :"+pass);
         System.out.println("Number of fails :"+fail);

      
   }
}      
      

      
      