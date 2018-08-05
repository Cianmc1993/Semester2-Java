
import java.util.*;
// ParkingTicketDispenser class

/* UML Diagram
 * ______________________________________
 * ParkingTicketDispenser
 * ______________________________________
 * parkingTicket: int
 * PARKING_SPOTS: final int
 * coins: int
 * COIN_VALUE: final double 0.5;
 * ______________________________________
 * ParkingTicketDispenser(parkingTicket: 0, PARKING_SPOTS: int)
 * ParkingTicketDispenser(parkingTicket: int, PARKING_SPOTS: int)
 * 
 * getParkingTicket(): int
 * setParkingTicket(no: int): void
 * getPARKING_SPOTS(): int
 * getCOIN_VALUE(): double
 * 
 * dispenseTicket() : void
 * returnTicket(): void
 * getCoins() : void
 * takeAllCoins(): void
 * takeCoins(): void
 * ______________________________________
*/

public class ParkingTicketDispenser
{
 // instance variables
 private final int PARKING_SPOTS;
 private final double COIN_VALUE =0.5;
 private int parkingTicket;
 private int coins;
 
 Scanner keyIn = new Scanner(System.in);
 
 // Constructors
 
 public ParkingTicketDispenser(int psAvl)
 {
   PARKING_SPOTS = psAvl;
 }
 
 public ParkingTicketDispenser(int psAvl, int pTi, int coI){
   PARKING_SPOTS = psAvl;
   parkingTicket = pTi;
   coins = coI;
 }

 // methods
 //--------------------------------------------
 // Setters and Getters
 

 public int getPARKING_SPOTS()
 { 
  return PARKING_SPOTS;  
 }
 
 public double getCOIN_VALUE()
 { 
  return COIN_VALUE;  
 }
 
 public void issueTicket(int pTi)
 { 
  parkingTicket  += pTi;
 }
 
  public void changeCoin(int pTi)
 { 
  coins  += pTi;
 }
 
 public int getParkingTicket()
 { 
  return parkingTicket;  
 }
 
  public int getCoin()
 { 
  return coins;  
 }
 //-------------------------------------------------
 // Other Methods
 
 public void dispenseTicket(){
   if(parkingTicket<PARKING_SPOTS){
     issueTicket(1);
     changeCoin(1);
   }
   else System.out.println("There are unfortunately no available parking spots at the minute.");
 }
 
 public void returnTicket(){
   System.out.println("How many tickets would you like to top up with?");
   int amount = keyIn.nextInt();
   if(PARKING_SPOTS-parkingTicket+amount> PARKING_SPOTS)System.out.println("The amount of parking tickets entered exceeds the handed out tickets.");
   else issueTicket(-amount);  
 }
 
 public void takeAllCoins(){
   System.out.println("You took out "+(double)(getCoin()*COIN_VALUE)+" Euro.");
   System.out.println("Equivalent to "+ getCoin() +" coins.");
   changeCoin(-getCoin());
   
 }
 
 public void takeCoins(){
   System.out.println("How many coins would you like to take out?");
   int amount = keyIn.nextInt();
   changeCoin(-amount);  
   System.out.println("You took out "+(double)(amount*COIN_VALUE)+" Euro.");
   System.out.println("Equivalent to "+ amount +" coins.");
 }
 
 public void displayMoney(){
   System.out.println("There is currently "+getCoin()/2+" Euro in the machine.");
 }

 public void displayTickets(){
   System.out.println("There is currently "+(getPARKING_SPOTS()-getParkingTicket())+ " tickets in the machine");
 }
 
 public void goodbye(){
   System.out.println("Goodbye");
   
 }

}// end of class