import java.util.*;

public class toString
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String webAddress = "www.LYIT.com";
      
      System.out.println(webAddress.toLowerCase());
      
      if(webAddress.startsWith("www."))
      {
         System.out.println("Address begins with www.");
      }
      else
         System.out.println("Does not begin with www.");
         
      if(webAddress.endsWith(".com"))
      {
         System.out.println(webAddress.replace(".com" , ".ie"));
      }
      
      String part1 = webAddress.substring(0,3);
      String part2 = webAddress.substring(4,8);
      String part3 = webAddress.substring(9,12);
      
      System.out.println(part1+ "  "+part2+"  "+part3);
   }
}