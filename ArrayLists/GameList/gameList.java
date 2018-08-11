import java.util.*;

public class gameList
{
   public static void main(String[] args) 
   { 
    
      Scanner keyboardIn = new Scanner(System.in);
      
      ArrayList <ComputerGame> gameList = new ArrayList <ComputerGame> ();
      
      boolean found = false;
      int count = 0;
      
      gameList.add(new ComputerGame("Call of duty", 2015 , 10.0));
      gameList.add(new ComputerGame("Halo", 2010 , 20.0));
      gameList.add(new ComputerGame("Call of duty", 2015 , 10.0));
      
      for(ComputerGame a : gameList)
      {
         System.out.println("Title :"+a.getTitle()+" Year :"+a.getYear()+" Price :"+a.getPrice());
      }
       
       for(ComputerGame a : gameList)
       {
         a.reducePriceBy(10);
         System.out.println(" Price "+a.getPrice());
       }
      
      System.out.println("Enter game you wish to remove :");
      String choice = keyboardIn.nextLine();
      
      for(int i = 0;i<gameList.size();i++)
      {
         if(gameList.get(i).getTitle().toLowerCase().equals(choice.toLowerCase()))
         {
            gameList.remove(i);
            found = true;
         }
      }
      if(found)
      {
         System.out.println("Removed game Titled: "+choice+"!");
      }
      else // if not found nofity not found
         System.out.println("No game Found Titled: "+choice+"!");
         
         for(int i = 0;i<gameList.size();i++)
         {
            if(gameList.get(i).equals("Call of duty"));
            {
               count++;
            }
         }
              System.out.println(count);



        
      
   }
}