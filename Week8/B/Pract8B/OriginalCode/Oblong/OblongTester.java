/*
	Written by : Maeve Carr
	Date:
	Desc:
*/

public class OblongTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Oblong
	   Oblong myOblong = new Oblong();
	   Oblong o2 = new Oblong(-10, 5);
	   
		// use methods to set instance variables
	   // myOblong.setHeight(10);
// 	   myOblong.setWidth(20);
// 	   
	   // use methods to retrieve values of instance variables
	   System.out.println("Oblong1\nWidth: " + myOblong.getWidth());
	   System.out.println("Height: " + myOblong.getHeight());   
	   System.out.println("Area: " + myOblong.calculateArea());
		
		  System.out.println("Oblong2\nWidth: " + o2.getWidth());
	   System.out.println("Height: " + o2.getHeight());   
	   System.out.println("Area: " + o2.calculateArea());

         
   }
}
