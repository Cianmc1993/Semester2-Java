/*CreditCardAccount
-----------------
nextAccNum: int
accountNumber: int
customerName: String
balanceDue: double
creditLimit: double
-------------------
CreditCardAccount (String)
--------------------
getAccountNumber( ): int
getBalanceDue ( ): double
setCreditLimit(double): void
makePurchase(double): void
makePaymentOnBalanceDue(double): void
-----------------------------
*/

public class CreditCardAccount
{
  private static int nextAccNum = 1;
  private int accountNumber;
  private String customerName;
  private double balance;
  private double creditLimit;
  
  public CreditCardAccount(String name)
  {
     accountNumber = nextAccNum++;
     customerName = name;
  }
  
  public int getAccountNumber()
  {
    return accountNumber; 
  }
  
  public double getBalance()
  {
    return balance;
  }
  
  public void setCreditLimit(double l)
  {
    creditLimit = l;
  }
  
  public void makePurchase(double p)
  {
    if(creditLimit>balance+p)
    {
      balance += p;
    }
    else
    {
      System.out.println ("Not sufficient credit.");
    }
  }
  
  public void makePayment(double p)
  {
    balance -= p;
  }
  
}