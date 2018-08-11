import java.util.*;

public class week9QC
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double num [] = {3.45, 6.28, 35.6, 9.99, 33.33};
      
      double choice;
      
      do{
      System.out.println("Choose number you wish to find: ");
      choice = keyboardIn.nextDouble();
         
         for(int i=0; i < num.length; i++)
         {
            if(choice == num[i])
            {
               System.out.println(choice+" was found at position: "+(i+1));
               System.out.println("Rounded: "+Math.round(num[i]));
               System.out.println("Square root "+Math.sqrt(num[i]));
            }
               else
               {
                   System.out.println("Number not found");
               }
            } 
               }while(choice !=0);
             
            
   }
}