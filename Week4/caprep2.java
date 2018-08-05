import java.util.*;
import java.text.*;

public class caprep2 {
  
  
  public static void main(String[] args) { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    DecimalFormat df = new DecimalFormat("0.00");
    
    // Array last names of 8 candidates
    String [] names = new String[8];
    // Array votes of 8 candidates
    int [] votes = new int[8];
    //Input information
    inputLoopString("names",names, keyboardIn);
    inputLoopInt("amount of votes",votes, keyboardIn);
    // Output: Name , Votes, Percentage
    ouputLoopNamesVotesPerc(votes, names, df);
    int total = calcTotal(votes);
    System.out.println(total + " are the total votes.");
    //Output: Name of Winner incl. Votes
    calcWinner(votes, names);
    //Output: Average Vote per cand
    double avg = calcAverage(votes);
    System.out.println("The average vote per Person is: "+ avg );
    //Output: Name and Number of Votes received for candidates above average
    calcAboveAverage(votes, names);
    //Input prompt for candidate -> Output: Name, Votes, no. of candidates who received more, same and less votes
    System.out.println("Please enter the candidates name you are looking for:");
    String prompt = keyboardIn.next();
    calcInputPrompt(votes, names, prompt);
    // go!
    
    
  }
  // Method Type: Void , Method to receive input on names
  // 1. Run for-loop to prompt input on names
  public static void inputLoopString(String input, String[] array, Scanner keyIn){
    for(int i=0; i<array.length;i++){
      System.out.println("Please enter "+ input+" :");
      array[i] = keyIn.nextLine();
    }
   }
  // Method Type: Void , Method to receive input on vote count
  // 1. Run for-loop to prompt input on votes 
   public static void inputLoopInt(String input, int[] array, Scanner keyIn){
    for(int i=0; i<array.length;i++){
      System.out.println("Please enter "+ input+" :");
      array[i] = keyIn.nextInt();
    }
   }
   // Method Type: Void , Method to output all names, votes, and percentages
   // 1. Run calcPerc() to get information on what the relative votes are per person
   // 2. Run for-loop to output all names, absolute votes and relative votes
   public static void ouputLoopNamesVotesPerc(int[] arrayInt, String[] arrayString, DecimalFormat df){
     double [] percentages = calcPerc(arrayInt);
     System.out.println("Names"+"\t\t\t"+"Votes"+"\t\t\t"+"Percentage");
    for(int i=0; i<arrayInt.length;i++){
      System.out.println(arrayString[i]+"\t\t\t"+arrayInt[i]+"\t\t\t"+ df.format(percentages[i]));
    } 
   }
   // Method Type: Int , Method to calculate Total votes
   // 1. Run for-loop and add all values
   // 2. Return int total
   public static int calcTotal(int[] arrayInt){
     int total =0;
     for(int i=0; i<arrayInt.length;i++){
       total += arrayInt[i];
     }
     return total;
   }
   // Method Type: Double , Method to calculate every persons percentage 
   // 1.Run calcTotal() go get overall votes
   // 2.Create an double array "percentages" with the same size as parameter array
   // 3.Run for-loop to calculate percentage vote
   // 4.Return array percentages
   public static double[] calcPerc(int[] arrayInt){
     int total = calcTotal(arrayInt);
     double[] percentages = new double[arrayInt.length];
     for(int i=0; i<arrayInt.length;i++){
       percentages[i] = ((double)arrayInt[i]/(double)total)*100;
     }
     return percentages;
   }
   // Method Type: Int , Method calculates highest Vote count
   // 1. Run for-loop to find the highest vote count
   // 2. Return int highestVote
   public static int calcHighest(int[] arrayInt){
     int highest =0;
     for(int i=0; i<arrayInt.length;i++){
       if(arrayInt[i]>highest) highest = arrayInt[i];
     }
     return highest;
   }
   //Method Type: Void , Method calculates Person/s with the highest vote count
   // 1. Run calcHighest() to receive highest vote count in votes array
   // 2. Output the highest vote count and every person with this vote count 
   public static void calcWinner(int[] arrayInt, String[] arrayString){
     int highest = calcHighest(arrayInt);
     System.out.println("Highest number of votes are:"+ highest);
     System.out.println("The Winner/s is/are:");
     for(int i=0; i<arrayInt.length;i++){
       if(arrayInt[i]==highest) System.out.println(arrayString[i]+"\t\t\t"+"with "+arrayInt[i]+" votes.");
     }
   }
   // Method Type: double , Method calculates the average vote  count
   // 1. Run calcTotal() to receive total vote count
   // 2. calculate average, return double average
   public static double calcAverage(int[] arrayInt){
     int total = calcTotal(arrayInt);
     double average=0;
     average = (double)total/(double)arrayInt.length;
     return average;
   }
   //Method Type: Void , Method outputs all candidates with a higher vote count than the average votes
   //1. calcAverage() generates the average
   //2. run for-loop to compare all votes to the average and output appropiate message
   public static void calcAboveAverage(int[] arrayInt, String[] arrayString){
     double average = calcAverage(arrayInt);
     System.out.println("Candidates with more votes than average are:");
     for(int i=0; i<arrayInt.length;i++){
       if(arrayInt[i]>average) System.out.println(arrayString[i]+"\t\t\t"+arrayInt[i]);
     }
   }
   // Method Type: Void , Method outputs all candidates that scored higher/even/lower than prompt candidate - or that prompt was not found 
   //The first for-loop checks if the prompt input is within all candidates
   //If the input exists, run a for loop to compare all candidates results with this candidate
   //else output that candidate was not found
   public static void calcInputPrompt(int[] arrayInt, String[] arrayString, String prompt){
     int position = -1;
     int higher=0; int lower=0; int equal=-1;
     for(int i=0; i<arrayString.length;i++){
       if(arrayString[i].equals(prompt)) {
         position = i;
         break;
       }
     }
     if(position != -1){
       
       System.out.println(arrayString[position]+"\t\t\t"+arrayInt[position]);
  
       for(int i=0; i<arrayInt.length;i++){
         if(arrayInt[i]>arrayInt[position])higher++;
         else if(arrayInt[i]<arrayInt[position])lower++;
         else equal++;
       }
      
       System.out.println(higher+ " candidate/s scored higher than "+prompt);
       System.out.println(lower+ " candidate/s scored lower than "+prompt);
       System.out.println(equal+ " candidate/s scored equal to "+prompt);
     }
     else System.out.println("No candidate with the name "+ prompt+" was found.");
   }
   
  
}