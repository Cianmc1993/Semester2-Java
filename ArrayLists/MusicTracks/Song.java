public class Song
{
private String artist; // Artist who performed song
private String title; // Title of the song
private int duration; // Play time in seconds
public Song (String artistIn, String titleIn, int secondsIn)
{
artist=artistIn;
title=titleIn;
duration=secondsIn;

}
// Accessor methods
public String getArtist()
{
   return artist;
}
public double getStorage()
{
// assume each minute of sound needs 1 mb of storage space
   return (double) duration/60;
}
public String getTitle()
{
   return title;
}
public int getDuration()
{
   return duration;
}
}