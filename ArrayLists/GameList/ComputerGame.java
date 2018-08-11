public class ComputerGame
{
 private String title;
 private int year;
 private double price;

 public ComputerGame(String titleIn, int yearIn, double priceIn)
 {
 title = titleIn;
 year = yearIn;
 price = priceIn;

 }
 
 public String getTitle()
 {
   return title;
 }
 
 public int getYear()
 {
   return year;
 }
 
  public double getPrice()
 {
   return price;
 }


 public void reducePriceBy(double rate)
 {
   price = price - price * (rate / 100);
 }
}