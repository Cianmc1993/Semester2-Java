import java.util.*;

public class cConverterTester
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double eR;
      int menu;
      
      System.out.println("What is the exchange rate today? ");
      eR = keyboardIn.nextDouble();
      
      cConverter Cc = new cConverter(eR);
      
      do{
         System.out.println(" Menu");
         System.out.println(" ****");
         System.out.println("1. View Exchange Rate");
         System.out.println("2. Change Exchange Rate");
         System.out.println("3. Euro into Sterlin");
         System.out.println("4. Sterling into Euro");
         System.out.println("0. Exit Application");
         System.out.print("\nEnter Choice: ");
         menu = keyboardIn.nextInt();
         
         switch(menu)
         {  
            case 1:
               System.out.println("Todays exchange rate is : "+Cc.getRate());
               break;
            case 2:
               System.out.println("Change exchange rate to : ");
               eR = keyboardIn.nextDouble();
               Cc.setRate(eR);
               break;
            case 3:
               System.out.println("Enter amount in euro : ");
               eR = keyboardIn.nextDouble();
               System.out.println("Todays exchange rate gives you gives you "+Cc.euroToSterling(eR)+" pound");
               break;
            case 4:
               System.out.println("Enter amount in sterling : ");
               eR = keyboardIn.nextDouble();
               System.out.println("This gives you "+Cc.sterlingToEuro(eR)+" euro");
               break;
            case 0:
               break;
            default:
               System.out.println("Invalid option");
               
         }
          }while(menu != 0);
          
          
   }
}
               
      
      