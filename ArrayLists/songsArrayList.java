import java.util.*;
import java.awt.Rectangle;
import java.util.Scanner;
import java.util.Random;

public class songsArrayList
{
  
  
   public static void main(String[] args) 
   { 
      Scanner input = new Scanner(System.in);
      String userSelection="";
      boolean trackFound=false;
      Random random = new Random();
      
      ArrayList <MusicTrack> myMp3Player = new ArrayList <MusicTrack> (); // (Q.5a) this creates the MusicTrack object array list 
      
      myMp3Player.add(new MusicTrack("Daft Punk", "Get Lucky", 2013)); // (Q.5b) this creates a new MusicTrack object and adds it to the array list
      myMp3Player.add(new MusicTrack("David Bowie", "Life on Mars", 1971)); // same as above
      
      for(MusicTrack a : myMp3Player) // (5.c) this loops through and didplays the artist and title of each MusicTrack object
      {
         System.out.println(a.getArtist()+": "+a.getTitle()); // print song title of current object in loop
      }
      
      
      for(MusicTrack a : myMp3Player) // (5.d) this loops through and didplays the songs before 2000
      {
         if(a.getYear()<2000) // IF: current MusicTrack objects year is less then the year 2000
            System.out.println(a.getTitle()); // print song title of current music track in loop
      }
      
      for(MusicTrack a : myMp3Player) // (5.e) this loops through and didplays any tracks recorded by David Bowie
      {
         if(a.getArtist().equals("David Bowie")) // IF: current MusicTrack's artist is david bowie [ the .equals method is used to compare strings not the = sign]
            System.out.println(a.getTitle()); // print song title of current music track in loop
      }
      
      // (5.f) ASK: user to enter title of music track to remove from MusicTrack array list
      System.out.print("Enter a title of track to remove: ");
      userSelection=input.nextLine();
      
      // loop through MusicTrack array list and remove object if track title matches user specified title
      for(int i=0; i<myMp3Player.size(); i++) // old for loop used here so we hava an i varaible to used to specify which if any index is to be removed(not possible with for each)  
      {
         if(myMp3Player.get(i).getTitle().toLowerCase().equals(userSelection.toLowerCase())) // IF: music track i's title(coverted to lowercase) matches user specified title(also converted to lowercase) 
         {
            myMp3Player.remove(i); // remove current music track at index i from music track array
            trackFound=true; // log track has been found to display apropriate message below
         }
         
      }
      if(trackFound) // IF: track title match notify found and removed 
            System.out.println("Removed Track Titled: "+userSelection+"!");
      else // if not found nofity not found
         System.out.println("No Track Found Titled: "+userSelection+"!");


      // (5.g) play random music track
      int shuffle = random.nextInt(myMp3Player.size()); // this picks a random number between 0 and the leng of the mp3player array list (0 inclusive)
      System.out.println("Now Playing: "+myMp3Player.get(shuffle).getTitle()+" by "+myMp3Player.get(shuffle).getArtist());
      // .get() the music track at index suffle(the random number generated) then .getTitle() of track then .getArtist() and print all to screen 
   }
}
      
       
