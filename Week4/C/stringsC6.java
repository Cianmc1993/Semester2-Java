import java.util.*;

public class stringsC6 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    String name1;
    String[] words = new String[10];
    int whiteSpaces =0;
    
 
     System.out.println("Please input sentence:");
     name1 = keyboardIn.nextLine(); 
     name1 += " ";
     
     
   
   
     for(int i=0;i<4;i++){
       whiteSpaces = name1.indexOf(" ");
       System.out.println(whiteSpaces);
       words[i] = name1.substring(0, whiteSpaces);
       name1 = name1.substring((whiteSpaces+1), name1.length());
       
     }
     
     for(int i=0;i>words.length;i++){    
       System.out.println(words[i]+ " Word number "+i);      
     }
     
     String longestWord= "";
     for(int i=0;i<4;i++){    
       if(words[i].length()>longestWord.length())longestWord=words[i];
     }
     System.out.println(longestWord);

      
  }
  
  
  
}