import java.util.*;

public class forEach

{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      Scanner keyboardIn1 = new Scanner(System.in);

      
      ArrayList <String> wordList = new ArrayList<String>()
      {
         {
          add("apple");
          add("cat");
          add("ball");
          add("dog");
         }
      };

      
      String word;
      int menu;
      int position;
      char letter;
      
      do{
         System.out.println("\n Menu");
         System.out.println("1.Add");
         System.out.println("2.Remove");
         System.out.println("3.View one word");
         System.out.println("4.View all words");
         System.out.println("5.Add word to particular position");
         System.out.println("6.Remove word by chosing position");
         System.out.println("7.Display all words followed by word length");
         System.out.println("0.Exit");
         System.out.println("         ");
         System.out.println("Enter your choice: ");
         menu = keyboardIn.nextInt();
         
         switch(menu)
         {
            case 1:
                  System.out.println("Enter word you wish to add: ");
                  word = keyboardIn1.nextLine();
                  wordList.add(word);
                  break;
            case 2:
                  System.out.println("Enter word you wish to remove: ");
                  word = keyboardIn1.nextLine();
                  wordList.remove(word);
                  break;
            case 3:
                  System.out.println("Which array would you like to view?: ");
                  position = keyboardIn1.nextInt();
                  wordList.get(position-1);
                  System.out.println();
                  break;
            case 4:
                  for(String s : wordList)
                  {
                     System.out.println(s);
                  }
                  break;
            case 5:
                  System.out.println("Enter word you wish to add: ");
                  word = keyboardIn.nextLine();
                  System.out.println("What position of the array? ");
                  position = keyboardIn1.nextInt();
                  wordList.add(position-1,word);
                  break;
            case 6:
                  System.out.println("What word position would you like to remove? ");
                  position = keyboardIn.nextInt();
                  wordList.remove(position-1);
                  break;
            case 7:
                  for(String s : wordList)
                  {
                     System.out.println(s+" , "+ s.length()+" letters");
                  }
                  break;
            // case 8:
//                    System.out.println("Insert letter: ");
//                    letter = keyboardIn.next().charAt(0);
//                    for(String s : wordList)
//                    {
//                      if(s.CharAt(0) == letter)
//                      {
//                       System.out.println(s.getName());
//                      }
//                    }
//                    break;
            case 8:
                  for(int i = 0; i < wordList.length; i++)
                  {
                     int longest =wordList[1];
                     int shortest=wordList[1];
                     int longCounter=0;
                     int shortCounter=0;
                     
                     if(wordList[i]<shortest)
                     {shortest = wordList[i];
                      shortCounter++;}
                     
                     if(wordList[i]>longest){
                     longest = wordList[i];
                     longestCounter++;}
                 }
                     System.out.println("Shortest word is "+shortest);
                     System.out.println("Longest word is "+longest);
            case 0:
                  System.out.println("Thank you, goodbye");
                  break;
            default:
                  System.out.println("Invalid option");
                  }
                  
                  
                     }while(menu != 0);
                     
   }
}
                  


                  
