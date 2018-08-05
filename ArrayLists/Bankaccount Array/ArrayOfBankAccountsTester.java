import java.util.*;/*
	Written by : Maeve Carr
	Date:
	Desc:
*/



public class ArrayOfBankAccountsTester
{
   public static void main(String [] args)
   { 
      
      Scanner keyboardIn = new Scanner(System.in); 
	   
      // create an Array of BankAccount objects
	   BankAccount[] accounts = new BankAccount[10];
      
      int menu;
      int acc;
      double amount;
      
       //load the array with BankAccount objects
       for(int i = 0; i < accounts.length; i++)
       {
          accounts[i] = new BankAccount(i + 1); //will load with bank accounts numbered 1 to 10
       }  
       
       //display details of each bankaccount object in the array 
      //  for(int i = 0; i < accounts.length; i++)
//        {
//           System.out.println("Acc# "+ accounts[i].getAccNumber() +"  Balance  " +  accounts[i].getBalance()); //
//           //or you could use toString()
//        }
      do{
      System.out.println("*****************************");
      System.out.println("1.View details of all accounts");
      System.out.println("2.View details of one account");
      System.out.println("3.Deposit");
      System.out.println("4.Withdraw");
      System.out.println("0.Quit");
      System.out.print("Please select option: ");
      menu = keyboardIn.nextInt();
      
      switch(menu)
      {
         case 1:
            for(int i = 0; i < accounts.length; i++){
            System.out.println("Account number "+ accounts[i].getAccNumber() +" : Balance  " +  accounts[i].getBalance());
            }
            break;
         case 2:
            System.out.println("Which account would you like to view? ");
            acc = keyboardIn.nextInt();
            if(acc < 0 || acc > 10){
               System.out.println("Error , enter valid choice");
               }
               else{
                  System.out.println("Account number "+accounts[acc].getAccNumber() +" Balance " + accounts[acc].getBalance());
                  }
             break;
         case 3:
            System.out.println("Which account would you like to deposit to? ");
            acc = keyboardIn.nextInt();
            if(acc < 0 || acc > 10){
               System.out.println("Error , enter valid choice");
               }
               else{
                System.out.println("How much would you like to deposit? ");
                amount = keyboardIn.nextDouble();
                accounts[acc].deposit(amount);
                }
             break;
         case 4:
            System.out.println("Which account would you like to withdraw from? ");
            acc = keyboardIn.nextInt();
            if(acc < 0 || acc > 10){
               System.out.println("Error , enter valid choice");
               }
               else{
               System.out.println("How much would you like to withdraw? ");
               amount = keyboardIn.nextDouble();
               accounts[acc].withdraw(amount);
               }
               break;
         case 0:
            System.out.println("Thank you , goodbye");
               break;
         default:
            System.out.println("Error , incorrect choice");
            
          }
            }while(menu != 0);

   
   }
}
