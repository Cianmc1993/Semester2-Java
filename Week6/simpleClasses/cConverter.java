public class cConverter
{
  public cConverter()
  {
    
  }
  
   public cConverter(double rate)
   {
     this.rate = rate;
   }
   
   private double rate;
   
   public void setRate(double r)
   {
      rate = r;
   }
   
   public double euroToSterling(double euro)
   {
      return euro * rate;
   }
   
   public double sterlingToEuro(double sterling)
   {
      return sterling * (1/rate);
   }
   
   public double getRate()
   {
      return rate;
   }
   
}
   