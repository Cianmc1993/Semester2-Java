import java.util.*;

public class randomNum
{
   public static void main(String []args)
   {
      int[] lottoNum = new int[6];
      
      Random noGen = new Random();
      
      for(int i=0;i<lottoNum.length;i++)
      {
         lottoNum[i] = noGen.nextInt(43)+1;
      }
      
      for(int i=0;i<lottoNum.length;i++)
      {
         System.out.println(lottoNum[i]);
      }
         
   }
}
      
      