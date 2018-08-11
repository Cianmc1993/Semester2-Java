public class Date
{
   private int day;
   private int month;
   private int year;
   
   public Date(){
      day = 1;
      month = 1;
      year = 1000;
   }
   
   public Date(int d,int m,int y)
   {
      day = d;
      month = m;
      year = y;
   }
   
   public int getDay()
   {
      return day;
   }
   
   public int getMonth()
   {
      return month;
   }
   
   public int getYear()
   {
      return year;
   }
   
   public void setDate(int d,int m,int y)
   {
      day = d;
      month = m;
      year= y;
   }
   
   public boolean equals(Date aD)
   {
      return (day == aD.getDay() && month == aD.getMonth() && year == aD.getYear());
   }    
   
   public String toString()
   {
      return day+"/"+month+"/"+year;
   }
  
}
   
   