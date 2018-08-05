import java.util.*;

public class binaryNumbers
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int[] binary = new int[8];
      
      System.out.println("PLease enter 8 binary numbers: ");
      
      for(int i=0; i<binary.length;i++)
      {
         System.out.println("PLease enter numbers: "+(i+1));
         binary[i] = keyboardIn.nextInt();
         
         while(binary[i] != 1 && binary[i] != 0)
         {
            System.out.println("Binary is 1's and 0's only");
            break;
         }
      }
           for(int i=0; i<binary.length;i++)
           {
               System.out.println(binary[i]);
           }
   }
}