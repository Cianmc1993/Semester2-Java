import java.util.Scanner;

public class ParkingDispenserTester{
  /**main method*/
   public static void main(String[] args){
      Scanner keyIn = new Scanner(System.in);
      int mC;
      
      ParkingTicketDispenser ptd = new ParkingTicketDispenser(10);
      

       do{
         System.out.println(" Menu LYIT Parking");
         System.out.println(" ****");
         System.out.println("1. Purchase a parking ticket");
         System.out.println("2. Fill up with x amount of tickets");
         System.out.println("3. Empty coins");
         System.out.println("4. Empty x amount of coins");
         System.out.println("5. Display amount of Money in Machine");
         System.out.println("6. Display number of tickets in Machine");
         System.out.println("0. Exit Application");
         System.out.print("\nEnter Choice: ");
         mC=keyIn.nextInt();
         switch(mC){  
            case 1: 
               ptd.dispenseTicket();
               break;
            case 2:
               ptd.returnTicket();
               break;   
            case 3:
               ptd.takeAllCoins();
               break;
            case 4:
               ptd.takeCoins();
               break;
            case 5:
               ptd.displayMoney(); 
               break;
            case 6:
               ptd.displayTickets();
               break;
            case 0:
               ptd.goodbye();
               break;
            default:
               System.out.println("\nError - incorrect menu option");
         }
      }while(mC!=0);
      
      
   }
}