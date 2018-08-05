import java.util.*;

public class temps
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      
      double totalTemp = 0;
      
      
      System.out.println("Please enter days for the month you want to add the temperatues for: ");
      int m = keyboardIn.nextInt();
      
      double[] temps = new double[m];
      
      //for loop to enter temperatures and add total
      for(int i=0; i<temps.length; i++)
      {
         System.out.println("Please enter Temperature "+(i+1));
         temps[i] = keyboardIn.nextDouble();
         
         totalTemp += temps[i];
      }
      // calc Avg temp and init coldest/warmest
      double avgTemp = totalTemp/temps.length;
      double coldest =temps[1];
      double warmest =temps[1];
      // for loop to find coldest and warmest temp
      for(int i=0; i<temps.length; i++)
      {
         if(temps[i]<coldest)coldest = temps[i];
         if(temps[i]>warmest)warmest = temps[i];
      }
      //for loop to find last days where coldest and warmest happened
       for(int i=0; i<temps.length; i++)
      {
         if(temps[i]==coldest) System.out.println("Day with coldest temp is: "+(i+1));
         if(temps[i]==warmest) System.out.println("Day with warmest temp is: "+(i+1));
      }
      // log hottest, coldest and avg
      System.out.println("Hottest temp is: "+warmest);
      System.out.println("Coldest temp is: "+coldest);
      System.out.println("Average temp is: "+avgTemp);
      
   }
}
      