import java.util.*;

public class printInitials
{
   public static void main(String[] args) 
   { 
      Scanner input = new Scanner(System.in);
      String usersFullName;
      int lastSpaceIndex;
      
      System.out.print("Enter your full name: ");
      usersFullName=input.nextLine();
      
      lastSpaceIndex=(usersFullName.lastIndexOf(' ')+1);      
 
      System.out.println(usersFullName.charAt(0)+ " "+
      usersFullName.charAt(lastSpaceIndex));
      
      
      
   }
}