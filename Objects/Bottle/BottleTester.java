import java.util.Scanner;
public class BottleTester
{
   //main method
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //variables
      int menu;
      double pour;
      Bottle btl = new Bottle(0.75);
      
      do{
         System.out.println(" Menu");
         System.out.println(" ****");
         System.out.println("1. Fill");
         System.out.println("2. Get current Fill");
         System.out.println("3. Get amount until full");
         System.out.println("4. Empty ");
         System.out.println("5. Pour specific amount");
         System.out.println("0. Exit Application");
         System.out.print("\nEnter Choice: ");
         menu = keyboardIn.nextInt();
         
         switch(menu)
         {
            case 1:
            btl.fill();
            break;
            
            case 2:
            btl.getCurrentFill();
            break;
            
            case 3:
            btl.getAmountNeededToFill();
            break;
            
            case 4:
            btl.empty();
            break;
            
            case 5:
            System.out.println("How much do you want to pour? ");
            pour = keyboardIn.nextDouble();
            btl.fill(pour);
            break;
            
            case 0:
            System.out.print("Thanks you, goodbye");
            break;
            
            default:
            System.out.print("Incorrect menu choice");
            }
            
               }while(menu != 0);
            
   }
}
            
            
         