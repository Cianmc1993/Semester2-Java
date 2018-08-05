import java.util.*;

public class TeamsMenu

{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      Scanner keyboardIn1 = new Scanner(System.in);
      
      ArrayList <String> teams = new ArrayList <String>();
      
      String team;
      int menu;
      int view;
      
      do{
         System.out.println("League Menu");
         System.out.println("1. View all teams");
         System.out.println("2. View one team (based on position)");
         System.out.println("3. Add a team (to end of list)");
         System.out.println("4. Insert a team in list");
         System.out.println("5. Remove a team");
         System.out.println("6. Remove a team (based on position)");
         System.out.println("0. Exit");
         System.out.println("         ");
         System.out.println("Enter your choice: ");
         menu = keyboardIn.nextInt();
         
         switch(menu)
         {
            case 1:
               for(int i=0; i<teams.size(); i++)
               {
                  System.out.println(teams.get(i));
                  }
                  break;
            case 2:
                  System.out.println("What position would you like to view? ");
                  view = keyboardIn1.nextInt();
                  System.out.println(teams.get(view));
                  break;
            case 3:
                  System.out.println("Enter team you wish to add: ");
                  team = keyboardIn1.nextLine();
                  teams.add(team);
                  break;
            case 4:
                  System.out.println("Enter team you wish to add: ");
                  team = keyboardIn1.nextLine();
                  System.out.println("Enter position you wish to add it to: ");
                  view = keyboardIn.nextInt();
                  teams.add(view-1, team);
                  break;
            case 5:
                  System.out.println("Enter team you wish to remove: ");
                  team = keyboardIn1.nextLine();
                  teams.remove(team);
                  break;
            case 6:
                  System.out.println("Enter position of team you wish to remove: ");
                  view = keyboardIn.nextInt();
                  teams.remove(view-1);
                  break;
            case 0:
                  System.out.println("Thank you, goodbye");
                  break;
            default:
                  System.out.println("Invalid option");}
                  
                  }while(menu != 0);
                  
   }
}