import java.util.*;
public class palimDrome
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
    
      int[] binary  = {1,0,1,0,0,1,0,1};
      int[] palimPalim = new int[4];
      int[] palimPalimR = new int[4];
       
       int trueCount =0;
       int j=0;
       
       for(int i=0; i<palimPalim.length; i++)
       {
          palimPalim[i] = binary[i];
       }
       
       for(int i=7; i>3; i--)
       {
          palimPalimR[j] = binary[i];
          j++;
       }
       
       for(int i=0; i<4; i++)
       {
          if(palimPalimR[i] == palimPalim[i])
          trueCount++;
       }
       
       if(trueCount ==4)System.out.println("It's a palim palim!");
       else System.out.println("It's no palim palim.");       
   }
}