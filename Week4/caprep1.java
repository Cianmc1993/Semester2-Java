import java.util.*;

public class caprep1 
{
  
  
  public static void main(String[] args) 
  { 
    
    Scanner keyboardIn = new Scanner(System.in);
    Random noGenerator = new Random();
    //Question A
    String str = new String();
    str = "humpty dumpty sat on a wall";
    //Question B
    System.out.println(str);
    //Question C
    System.out.println(str.length());
    //Question D
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(str.length()-1));
    System.out.println(str.charAt(str.length()/2));
    //Question E
    // "on a wall" - "by the sea"
    System.out.println(str.replace("on a wall", "by the sea"));
   //Question F
    // first word
    int whitespace =str.indexOf(" ");
    System.out.println(str.substring(0,whitespace));
    //Question G
    
    // second word
    whitespace =str.indexOf(" ");
    String secondWord = str.substring(whitespace+1,str.length()-1);
    whitespace = secondWord.indexOf(" ");
    System.out.println(secondWord.substring(0,whitespace));
    //Question H
    // amount words
    str = "humpty dumpty sat on a wall more words to go let's see what happens now";
    int wordCount =1;
    
    for(int i=0; i<str.length(); i++)
    {
      if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
      wordCount++;  
    }
    System.out.println(wordCount);
    
  }
  
  
  
}