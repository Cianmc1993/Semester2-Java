import java.util.*;

public class Teams

{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      ArrayList <String> teams = new ArrayList <String>();
      
      String team;
      
      for(int i=0; i<5; i++)
      {
         System.out.println("Enter team "+(i+1)+ ": ");
         team = keyboardIn.nextLine();
         teams.add(team);
      }
          System.out.println("Premier league top teams:"); 
          System.out.println(teams);
//          
//          System.out.println("Select team you wish to add: ");
//          team = keyboardIn.nextLine();
//          teams.add(2, team);
//          
         //System.out.println(teams);
         
           
         System.out.println("Select team you wish to remove: ");
         team = keyboardIn.nextLine();
         teams.remove(team);
         
         System.out.println("After calling remove()Premier league top teams:");
         System.out.println(teams);
         
         
   }
}