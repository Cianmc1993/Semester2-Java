public class ClockTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Clock
	   Clock myclock = new Clock(03,57,00);
      Clock myclock2 = new Clock(06,43,40);   
	
      //to see the time have to call all three methods
      System.out.println("The time is : " +myclock.getHours() +":"
         + myclock.getMinutes() +":"  +myclock.getSeconds() ); 
 
		for(int i = 0; i < 10000; i++)
      
      myclock.tickTock();
			
		 System.out.println("The time is : " +myclock.getHours() +":"
         + myclock.getMinutes() +":"  +myclock.getSeconds() );
         
       System.out.println(myclock);  //this calls .toString()
       System.out.println(myclock2);
      
       
       if(myclock.equals(myclock2))
       System.out.println("Clocks are the same time");
		
   }
}
