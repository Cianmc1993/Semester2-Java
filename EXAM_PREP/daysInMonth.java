import java.util.*;
public class daysInMonth
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
    //Question2
      int probe = 0;
      int days=0;
      int[] myArray = new int[13];
      
      do
      {
         System.out.println("Enter month number [1 to 12], enter other to stop.");
         probe = keyboardIn.nextInt();
         
         for(int i=0; i<myArray.length; i++)
         {
         if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)myArray[i] = 31;
         
         else if ( i==4 || i==6 || i==9 || i==11)myArray[i] = 30;
         
         else myArray[i] = 28;

         
            if(probe<1 || probe > 12)
            break; 
             
            days = myArray[probe];
            }
            System.out.println(days);
        
            }while(probe != -1);
            
           System.out.println("Goodbye");
         
   }
}
