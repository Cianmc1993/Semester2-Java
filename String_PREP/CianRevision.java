import java.util.*;

public class CianRevision
{
   public static void main(String[] args) 
   { 
      Scanner input = new Scanner(System.in);
      String usersFullName;
      int lastSpaceIndex;
      
      System.out.print("Enter your full name: ");
      usersFullName=input.nextLine();
      
      // the last indexOf(int ' ') method takes in a char (a ' '(space) in this example) and returns the index of the last occurence of the character past in
      lastSpaceIndex=(usersFullName.lastIndexOf(' ')+1); // here i add 1 to it to give me the index after the second space which gives me the index of the 1 letter in the 3rd word in the string
      
      // now i just print that index
      System.out.println(usersFullName.charAt(0)+ " "+
      usersFullName.charAt(lastSpaceIndex));
      
      
      
   }
}