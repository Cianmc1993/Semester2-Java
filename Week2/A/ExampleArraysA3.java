import java.util.*;
public class ExampleArraysA3
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      String probe;
    //Question3
       int[] myArray = new int[6];
      
       for(int i=0; i<6; i++)
       {
         System.out.println("Enter your result for subject "+(i+1)+": ");
         myArray[i] = keyboardIn.nextInt();
       }
       
       System.out.println("Your results are:");
       
       for(int i=0; i<6; i++)
       {
         if(myArray[i]>39)probe = "Pass";
         
         else probe = "Fail";
         
         System.out.println(myArray[i]+ "  "+ probe);
       }
      
     
      
   }
   

}
