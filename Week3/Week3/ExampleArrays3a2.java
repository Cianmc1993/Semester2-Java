import java.util.*;
public class ExampleArrays3a2
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      int rowTotal =0;
      int columnTotal =0;
      int choice=0;
    //Question2
       int[][] seats = new int[14][6];
       int[][] bookedSeats = new int[14][6];  
     
     do{      
     System.out.println("Flight booking system");
     System.out.println("1. Book a seat");
     System.out.println("2. Cancel a seat");
     System.out.println("3. Show current booking status");
     System.out.println("4. Reset");
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
     }else if(choice==0){
         System.out.println("Thank you Goodbye");
      }
    }while(choice !=0);   
   }
   public static void showAllBookings(int seats[][], int bookedSeats[][], Scanner keyboardIn){
      System.out.println("Current bookings are:");
      for(int j=0; j<seats.length; j++){ 
       for(int i=0; i<seats[0].length; i++){
          System.out.print("Seat "+(j+1)+"|"+(i+1)+" [ "+bookedSeats[j][i]+" ]     ");
        
       }
       System.out.println();
     } 

   }
   
   public static void bookSeat(int seats[][], int bookedSeats[][], Scanner keyboardIn){
      System.out.println("Which seat would you like to book:");
      System.out.println("Row:");
      int row = keyboardIn.nextInt();
      System.out.println("Seat:");
      int column = keyboardIn.nextInt();
      
      bookedSeats[row-1][column-1] = 1;
   }
   
    public static void cancelSeat(int seats[][], int bookedSeats[][], Scanner keyboardIn){
      System.out.println("Which seat would you like to cancel:");
      System.out.println("Row:");
      int row = keyboardIn.nextInt();
      System.out.println("Seat:");
      int column = keyboardIn.nextInt();
      
      bookedSeats[row-1][column-1] = 0;
   }
   
   public static void resetAll(int seats[][], int bookedSeats[][], Scanner keyboardIn){
      
      for(int j=0; j<seats.length; j++){ 
       for(int i=0; i<seats[0].length; i++){
          bookedSeats[j][i] = 0;
        
       }
     } 

   }
   
   public static void bookingStatus(int seats[][], int bookedSeats[][], Scanner keyboardIn){
      int counter=0;
      int total=0;
      for(int j=0; j<seats.length; j++){ 
       for(int i=0; i<seats[0].length; i++){
          total += bookedSeats[j][i];
          counter++;
       }
     }
     System.out.println(counter+ " Seats are in the plane."); 
     System.out.println(total+ " Seats are booked."); 

   }




}
