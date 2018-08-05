public class BankAccount
{
	//instance variables
	//accessSpec type varname;
	private double balance;
	private int  accNumber;
   private static int  nextAccNo = 1;
	
	public BankAccount()
	{
		accNumber = nextAccNo++;//assign current value of nextAccNo to accNo and then increm - create a unique account nu
		balance = 0.0; 
	}

	public BankAccount(double openBal)
	{
		accNumber = nextAccNo++;
		balance = openBal; 
	}
	//methods
	//accessSpec returntype varname(argList){}
	//return the balance
	public double getBalance()
	{
		return balance;
	}
	
	//reduce the balance by amount
	public void withdraw(double amount)
	{
		if(amount <= balance) //if enought money
			balance = balance - amount; //balance -=amount
	}
	//increase the balance by amount
	public void deposit(double amount)
	{
		balance = balance + amount;	
	}
	
	public int  getAccNumber()
	{
		return accNumber;	
	}
   
   
   public String toString()
   {
      return "Account Number: " +accNumber +", Balance: " +balance; 
   
   }
	
}//end class