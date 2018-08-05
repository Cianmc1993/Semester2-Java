import java.util.*;
public class ExampleArrays3b3
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      int rowTotal =0;
      int columnTotal =0;
      int choice=0;
    //Question3
       int[][] seats = new int[14][6];
       boolean[][] bookedSeats = new boolean[14][6];  
     
     do{      
     System.out.println("Flight booking system");
     System.out.println("1. Book a seat, shows booking status of all seats");
     System.out.println("2. Cancel a seat");
     System.out.println("3. Show current booking status, includes all free and booked seats");
     System.out.println("4. Reset all bookings");
     System.out.println("5. Display specific Row");
     System.out.println("6. List all available window seats");
     System.out.println("7. List all available aisle seats");
     System.out.println("8. Display seats with 2 adjacent seats");
     System.out.println("0. Quit");
     System.out.println("Enter option:");
     choice = keyboardIn.nextInt();
     
     if(choice==1){
         showAllBookings(seats, bookedSeats, keyboardIn);
         bookSeat(seats, bookedSeats, keyboardIn);
     }else if(choice==2){
         cancelSeat(seats, bookedSeats, keyboardIn);
     }else if(choice==3){
         bookingStatus(seats, bookedSeats, keyboardIn);
     }else if(choice==4){
         resetAll(seats, bookedSeats, keyboardIn);
     }else if(choice==5){
         specificRow(seats, bookedSeats, keyboardIn);
     }else if(choice==6){
         windowSeats(seats, bookedSeats, keyboardIn);
     }else if(choice==7){
         aisleSeats(seats, bookedSeats, keyboardIn);
     }else if(choice==8){
         adjacentSeats(seats, bookedSeats, keyboardIn);
     }else if(choice==0){
         System.out.println("Thank you Goodbye");
      }
    }while(choice !=0);   
   }
   public static void showAllBookings(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      System.out.println("Current bookings are:");
      for(int j=0; j<seats.length; j++){ 
       for(int i=0; i<seats[0].length; i++){
          System.out.print("Seat "+(j+1)+"|"+(i+1)+" [ "+bookedSeats[j][i]+" ]     ");
        
       }
       System.out.println();
     } 

   }
   
   public static void bookSeat(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      System.out.println("Which seat would you like to book:");
      System.out.println("Row:");
      int row = keyboardIn.nextInt();
      System.out.println("Seat:");
      int column = keyboardIn.nextInt();
      
      bookedSeats[row-1][column-1] = true;
   }
   
    public static void cancelSeat(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      System.out.println("Which seat would you like to cancel:");
      System.out.println("Row:");
      int row = keyboardIn.nextInt();
      System.out.println("Seat:");
      int column = keyboardIn.nextInt();
      
      bookedSeats[row-1][column-1] = false;
   }
   
   public static void resetAll(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      
      for(int j=0; j<seats.length; j++){ 
       for(int i=0; i<seats[0].length; i++){
          bookedSeats[j][i] = false;
        
       }
     } 

   }
   
   public static void bookingStatus(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      int counter=0;
      int total=0;
      for(int j=0; j<seats.length; j++){ 
       for(int i=0; i<seats[0].length; i++){
          if(!bookedSeats[j][i]) counter++;
       }
     }
     System.out.println(counter+ " Seats are in the plane."); 
     System.out.println(total+ " Seats are booked."); 
     System.out.println((counter-total)+ " Seats are free."); 

   }
   
   public static void specificRow(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      System.out.println("Which row would you like to display:");
      int row = keyboardIn.nextInt();
      for(int i=0; i<seats[0].length; i++){
          System.out.print("Seat "+i+" | "+bookedSeats[row-1][i]+" ; "); 
       }

   }
   
   public static void windowSeats(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      for(int i=0; i<seats.length; i++){
          System.out.println("Row "+(i+1)+" | Seat 1 "+bookedSeats[i][0]+" ; ");
          System.out.println("Row "+(i+1)+" | Seat 6 "+bookedSeats[i][seats[0].length-1]+" ; "); 
       }

   }
   
    public static void aisleSeats(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      for(int i=0; i<seats.length; i++){
          System.out.println("Row "+(i+1)+" | Seat 3 "+bookedSeats[i][3]+" ; ");
          System.out.println("Row "+(i+1)+" | Seat 4 "+bookedSeats[i][4]+" ; "); 
       }

   }
   
    public static void adjacentSeats(int seats[][], boolean bookedSeats[][], Scanner keyboardIn){
      for(int i=0; i<seats.length; i++){
          System.out.println("Row "+(i+1)+" | Seat 2 "+bookedSeats[i][2]+" ; ");
          System.out.println("Row "+(i+1)+" | Seat 5 "+bookedSeats[i][5]+" ; "); 
       }

   }





}
