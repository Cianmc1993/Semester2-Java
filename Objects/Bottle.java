/* UML Diagram :
 * ______________________
 * Bottle
 * ______________________
 * final maxCap: double
 * currentFill:  double
 * ______________________
 * Bottle()
 * Bottle(maxCap: double)
 * Bottle(maxCap: double, currentFill: double)
 * ______________________
 * fill(): void
 * empty(): void
 * pour(pouredAmount: double): void
 * getCurrentFill(): void
 * getneededToFill(): void
 * ______________________
 */
 
public class Bottle
{
   //instance variables
   private double maxCap = 0.75;
   private double currentFill = 0.0;
   
   //constructors
   public Bottle()
   {
      maxCap = maxCap;
      currentFill = currentFill;
   }
   
   public Bottle(double maxCap)
   {
      
      maxCap = maxCap;
      currentFill = 0.0;
   }
   
   public Bottle(double maxCap , double currentFill)
   {
      maxCap = maxCap;
      currentFill = currentFill;

      if(currentFill <= maxCap)
      currentFill = currentFill;
   }
   
   //methods
   public void fill()
   {
      currentFill = maxCap;
   }
   
   public void empty()
   {
      currentFill = 0.0;
   }
   
   public void fill(double amountPoured)
   {
      if(amountPoured <= currentFill)
         currentFill -= amountPoured;
      else
         System.out.print("Not enough water in the bottle to pour");
   }
      
   public void getCurrentFill()
   {
      System.out.println(currentFill);
   }
   
   public void getAmountNeededToFill()
   {
      System.out.println(maxCap - currentFill);
   }
   
}
            
   