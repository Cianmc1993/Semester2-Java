import java.util.*;

public class carSales
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String[] names={"Joe Bloggs","Maeve Carr","John Conaghan","Andrea Carlin","Gary Cullen","Paul Corey"};
      
      int[] sold={27,32,52,89,25,49};
      
      int menu;
      int reachedCounter=0;
      int failedCounter=0;
      int highest=sold[0];
      int lowest=sold[0];
      int pos=0;
      int total=0;
      int aboveAverage=0;
      double average=0;
                 
      for(int i=0;i<sold.length;i++)
      {
         if(sold[i] > 50)reachedCounter++;
         if(sold[i] < 50)failedCounter++;
      }
         System.out.println("Number that reached target "+reachedCounter);
         System.out.println("Number that failed target "+failedCounter);


      do
      {
      System.out.println("\n\n\nMenu");
      System.out.println("1.Employee with highest sales");
      System.out.println("2.Employee with lowest sales");
      System.out.println("3.Calculate average");
      System.out.println("4.Employees sold higher than average");
      System.out.println("5.Calculate bonuses");
      System.out.println("6.Find employee");
      System.out.println("0.Quit");
      
      System.out.println("Enter Choice: ");
      menu = keyboardIn.nextInt();
      
      
      
      switch(menu)
      {
         case 1:
               for(int i=0; i<sold.length; i++)
               {
                  if(sold[i] > highest)
                  {
                     highest=sold[i];
                     pos = i;
                  }   
               }
                  
                   System.out.println("The highest sales person is: "+sold[pos] +" sold by: " +names[pos]);
                   break;
         case 2:
               for(int i=0; i<sold.length; i++)
               {
                  if(sold[i] < lowest)
                  {
                     lowest=sold[i];
                     pos = i;
                  }   
               }
                  System.out.println("The lowest sales person is: "+sold[pos] +" sold by: " +names[pos]);
                  break;
         case 3:
               for(int i=0; i<sold.length; i++)
               {
                   total = total+sold[i];
               }
                   average = total/sold.length;
                                     
                   System.out.println("The average is "+average);
                   break;
         case 4:
               for(int i=0; i<sold.length; i++)
               {
                  if(sold[i] >= average)
                  {
                     aboveAverage++;
                  }
               }  
                        
                  System.out.println("The number of employees that sold above average "+aboveAverage);
                  break;
         }      
               }while(menu != 0);
               
    
                
                 
      
   }   
}