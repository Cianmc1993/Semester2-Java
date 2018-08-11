import java.util.*;

public class songList
{
   public static void main(String[] args) 
   { 
    
      Scanner keyboardIn = new Scanner(System.in);
      
      
      ArrayList <Song> music = new ArrayList <Song> ();
      
      music.add(new Song("Imelda May" , "Tenkish Town Waltz" , 224));
      music.add(new Song("Eminem" , "Wont back down" , 150));
      music.add(new Song("50cent" , "inda club" , 120));
      
      int count=0;
      double total =0;
      String choice;
      boolean found = false;
      
      for(Song a : music)
      {
         System.out.println(a.getArtist() + " : " +a.getTitle());
      }
      
      for(Song a : music)
      {
         if(a.getStorage() >= 3.5)
         {
            count++;
         }
      }
         System.out.println("Songs greater than 3.5mbs : "+count); 
      
      for(Song a : music)
      {
         total = total + a.getStorage();
      }
         System.out.println("A minimum of "+total+ " mbs is required");
         
      System.out.println("Enter song you wish to remove: ");
      choice = keyboardIn.nextLine();
         
      for(int i=0;i<music.size();i++)
      {
         if(music.get(i).getTitle().equals(choice))
         {
            music.remove(i);
            found = true;
         }
      }
         if(found)
         {
            System.out.println("Removed song :"+choice);
         }
         else  
            System.out.println("Not song found titled:"+choice);
         
   }
}
