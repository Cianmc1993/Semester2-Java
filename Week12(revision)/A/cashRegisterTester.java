import java.util.*;

public class cashRegisterTester
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      Register reg = new Register();
      
      double purchase;
      double tendered;
      double amount;
      int menu;
      
      do{
         System.out.println("\nCash register");
         System.out.println("1.Make a purchase");
         System.out.println("2.Add money to till");
         System.out.println("3.Empty till");
         System.out.println("4.Get balance");
         System.out.println("0.Quit");
         
         System.out.println("Enter choice: ");
         menu = keyboardIn.nextInt();
         
         switch(menu){
            case 1:
                  System.out.println("Enter amount of purchase: ");
                  purchase = keyboardIn.nextDouble();
                  System.out.println("Enter amount tendered :");
                  tendered = keyboardIn.nextDouble();
                 
                  reg.makePurchase(purchase,tendered);
                  break;
            case 2:
                  System.out.println("Enter amount : ");
                  amount = keyboardIn.nextDouble();
                  reg.add(amount);
                  break;
            case 3:
                  reg.empty();
                  break;
            case 4:
                  System.out.println(reg.getBalance());
                  break;
            case 0:
                  System.out.println("Thank you, goodbye");
                  break;
            default:
                  System.out.println("Error, enter valid option");
            }   
               }while(menu != 0);
               
   }
}
                 



                  