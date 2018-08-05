/* UML Diagram :
------------------
Register
------------------
balance : double
-------------------
cashRegister(balance: double)
-------------------
empty(): void
purchase(purchaseAmount:double): void
getCurrentBalance: void
--------------------
*/

public class Register
{
   //instance variables
   private double balance;
   private double change;
   
   //constructor   
   public Register(double balIn)
   {
      balance = balIn;
   }
   
   public Register()
   {
      balance = 0;
   }

   
   public void empty()
   {
      balance = 0.0;
   }
   
   public void makePurchase(double purchaseAmount, double tenderedAmount)
   {  
      change = tenderedAmount - purchaseAmount;
      balance =  balance + tenderedAmount - change;
      
      if(tenderedAmount < purchaseAmount)
      {
         System.out.println("Sorry, not enough money was given");
      }
      else
         System.out.println("Change due: "+change);

   }
   
   public double getBalance()
   {
      return balance;
   }
   
   public void add(double amount)
   {
      balance = balance +amount;
   }
   
}
   
   
      