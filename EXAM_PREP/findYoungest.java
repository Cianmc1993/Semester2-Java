import java.util.*;

public class findYoungest
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int[] students = new int[7];
  
      for(int i=0; i<7; i++)
      {
         System.out.println("Please enter age for student: "+(i+1));
         students[i] = keyboardIn.nextInt();
      }
      
      int youngest =students[1];
      int oldest =students[1];
      int counter =0;
      
      for(int i=0; i<7; i++)
      {
         if(students[i]<youngest)youngest = students[i];
         if(students[i]>oldest)oldest = students[i];
         if(students[i]>20) counter++;
      }
      System.out.println("Youngest age is: "+youngest);
      System.out.println("Oldest age is: "+oldest);
      System.out.println("Students older than 20: "+counter);
      
   }
}