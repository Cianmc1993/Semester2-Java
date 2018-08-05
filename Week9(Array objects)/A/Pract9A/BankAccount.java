

public class BankAccount
{
	//instance variables
	//accessSpec type varname;
	private double balance;
	private int  accNumber;
	
	public BankAccount(int accNoIn)
	{
		accNumber = accNoIn;
		balance = 0.0; 
	}

	public BankAccount(int accNoIn,double openBal)
	{
		accNumber = accNoIn;
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
      else System.out.println("Insufficent funds");
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
   
   //returns a string representation of the object
   public String toString()
   {
      return "Acc Number: " +accNumber +", Balance: " +balance;
   }
   
   //returns true if two bankaccounts are equal - false otherwise
   public boolean equals(BankAccount other)
   {
      return accNumber == other.accNumber; 
   }

	
}//end class