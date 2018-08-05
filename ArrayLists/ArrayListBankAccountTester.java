/*
	Written by : Maeve Carr
	Date:
	Desc:
*/
import java.util.*; 
public class ArrayListBankAccountTester
{
   public static void main(String [] args)
   {  
      Scanner keyboardIn = new Scanner(System.in);
      //create an empty arraylist of bankaccount objects		
      ArrayList <BankAccount> accounts  = new ArrayList <BankAccount>();
            
      int option; 
      String name;
      int acc;
      double amount;
      
      do{
         
         System.out.println("\nBank Menu");
         System.out.println("1. Open an account");
         System.out.println("2. Close an account");
         System.out.println("3. View All");
         System.out.println("4. View one");
         System.out.println("5. Deposit");
         System.out.println("6. Withdraw");
         System.out.println("0. Exit" );
         
         System.out.print("\nEnter your choice: " );
         option = keyboardIn.nextInt();
         
         
         switch(option)
         {
             case 1:
                   accounts.add(new BankAccount());
                   break;
            case 2:
                  System.out.println("What account would you like to remove? ");
                  acc = keyboardIn.nextInt();
                  if(acc>-1 && acc<=accounts.size()){
                  accounts.remove(acc-1); 
                  }else
                  System.out.println("Account does not exist");
                  break;
            case 3:
                  for(BankAccount b : accounts)
                  {
                   System.out.println(b);
                  }           
                  break;     
            case 4: 
                  System.out.println("Which account would you like to view? ");
                  acc = keyboardIn.nextInt();
                  if(acc>-1 && acc<= accounts.size()){
                  System.out.println("Account number "+accounts.get(acc).getAccNumber() +" Balance " + accounts.get(acc).getBalance());  
                  }else
                  System.out.println("Account does not exist");
                  break;
            case 5:
                  System.out.println("Which account would you like to deposit to? ");
                  acc = keyboardIn.nextInt();
                  if(acc>-1 && acc<= accounts.size()){
                  System.out.println("How much would you like to deposit? ");
                  amount = keyboardIn.nextDouble();
                  accounts.get(acc-1).deposit(amount);
                  }else
                  System.out.println("Error , enter valid choice");
                  break;   
            case 6:  
                  System.out.println("Which account would you like to withdraw from? ");
                  acc = keyboardIn.nextInt();
                  if(acc>-1 && acc<= accounts.size()){
                  System.out.println("How much would you like to withdraw? ");
                  amount = keyboardIn.nextDouble();
                  accounts.get(acc-1).withdraw(amount);
                  }
                  else
                  System.out.println("Error , enter valid choice");                  
                  break;
           case 0:  //empty case
               break;
                                   
            default: System.out.print("INVALID ENTRY - enter a value from 0 to 6"); 
         
                   
         }
         
         
      }while(option != 0);   
   
   }
}
