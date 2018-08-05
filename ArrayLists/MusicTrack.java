public class MusicTrack
{
 private String title;
 private String artist;
 private int year;
 
 public MusicTrack(String artistIn, String titleIn, int yearIn)
 {
 title = titleIn;
 year = yearIn;
 artist = artistIn;
 }

 public String getTitle()
 {
 return title;
 }

 public String getArtist()
 {
 return artist;
 }

 public int getYear()
 {
 return year;
 }
}