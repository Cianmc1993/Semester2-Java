import java.util.*;

public class findValue
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int[] numbers = {1,2,3,4,5,6};
      
      int pos=0;

      System.out.println("Enter value you wish to find :");
      int find = keyboardIn.nextInt();
      
      for(int i=0;i<numbers.length;i++)
      {
         if(numbers[i] == find)
         {
             pos = i;
         }   
      }
      
         System.out.println("Value is at position: "+pos);
         
   }
}
         
      
