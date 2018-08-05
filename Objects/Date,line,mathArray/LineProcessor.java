import java.util.*;

public class LineProcessor
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String line;
      int Letters=0;
      int WhiteSpaces=0;
      int Word=1;
      
      System.out.println("Enter string: ");
      line = keyboardIn.nextLine();
      
      for(int i=0;i<line.length();i++){
       WhiteSpaces = line.indexOf(" ");
       System.out.println(WhiteSpaces);
       }
                       
  }  
}
         