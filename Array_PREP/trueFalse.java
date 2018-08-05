import java.util.*;

public class trueFalse
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      char[] answers ={'c','i','a','n'};
      
      char[] guess = new char[4];
      int correct=0;
      int wrong=0;
      
      for(int i=0;i<answers.length;i++)
      {
         System.out.println("Enter answer "+(i+1)+":");
         guess[i] = keyboardIn.next().charAt(0);
      }
      
      for(int i=0;i<answers.length;i++)
      {
         if(guess[i] == answers[i])
         {
            correct++;
         }
         else 
         {
            wrong++;
         }   
      }
         System.out.println("Number of correct answers "+correct);
         System.out.println("Number of wrong answers "+wrong);  
   }
}
