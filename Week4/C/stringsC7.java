import java.util.*;

public class stringsC7 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    String name1;
    char letter;
    String[] words = new String[10];
    int whiteSpaces =0;
    
 
     System.out.println("Please input sentence:");
     name1 = keyboardIn.nextLine(); 
     name1 += " ";
     
     System.out.println("Find words starting with the letter:");
     letter = keyboardIn.next().charAt(0);
     
   
     for(int i=0;i<4;i++){
       whiteSpaces = name1.indexOf(" ");
       words[i] = name1.substring(0, whiteSpaces);
       name1 = name1.substring((whiteSpaces+1), name1.length());
       
     }
     
     for(int i=0;i<4;i++)
     {    
       if(words[i].charAt(0) == letter)
       System.out.println(words[i]);      
     }
     
    
     

      
  }
  
  
  
}