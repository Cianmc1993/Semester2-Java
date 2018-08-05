import java.util.*;

public class toStringDictionary
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String name1 ;
      String name2;
      
      System.out.println("Enter name1 :");
      name1 = keyboardIn.nextLine();
      
      System.out.println("Enter name2 :");
      name2 = keyboardIn.nextLine();

      for(int i=0;i<name1.length();i++)
      {
         if((int)name1.charAt(i)<(int)name2.charAt(i))
         {
            System.out.println(name1+" comes before "+name2);
            break;
         }
         else if((int)name1.charAt(i)>(int)name2.charAt(i))
         {
            System.out.println(name2+" comes before "+name1);
            break;
         }
      }
   }
}
      