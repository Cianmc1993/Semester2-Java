public class DateTester
{
   public static void main(String[] args)
   {   
      Date PreSet = new Date();
      Date today = new Date(18, 3, 2018);
      Date today2 = new Date(18, 4, 2018);
      
     System.out.println(PreSet.toString());
     System.out.println(today.toString());
     
     if(today.equals(today2))System.out.println("true");
     if(!today.equals(PreSet))System.out.println("false");
     
     PreSet.setDate(18,3,2018);
     System.out.println(PreSet);
     
   }
}