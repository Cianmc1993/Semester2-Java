/*
	Written by : Maeve Carr
	Date:
	Desc:
*/

public class BankAccountTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type BankAccount
	  	BankAccount myAccount = new BankAccount(145);
	   BankAccount mySav = new BankAccount(456, 1000);

	   System.out.println("My account no " +myAccount.getAccNumber() );
		System.out.println("My account Initial Balance " +myAccount.getBalance() );		
		 	

		System.out.println("My saving no " +mySav.getAccNumber() );
		System.out.println("my saving Initial Balance " +mySav.getBalance() );
		
		  
// 	
// 		System.out.println("After calling deposit(100) balance is:  " +myAccount.getBalance() );
// 		
// 		myAccount.withdraw(15);   
// 	
// 		System.out.println("After calling withdraw(15) balance is:  " +myAccount.getBalance() );

   }
}
