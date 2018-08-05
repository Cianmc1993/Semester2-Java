import java.util.*;

public class ExamPaper
{
   public static void main(String[] args) 
   { 
    
     Scanner keyboardIn = new Scanner(System.in);
      
     System.out.println("Enter size of array: ");
     int n = keyboardIn.nextInt();
     
     int[] numbers = new int[n];
     
     for(int i=0;i<numbers.length;i++)
     {
        System.out.println("Enter valur for array "+(i+1)+":");
        numbers[i] = keyboardIn.nextInt();
     }
     
     for(int i=0;i<numbers.length;i++)
     {
        System.out.println(numbers[i]);
     }
     
     for(int i=numbers.length-1;i>-1;i--)
     {
        System.out.println(numbers[i]);
     }
     
   }
}
     
     
     
     
   
