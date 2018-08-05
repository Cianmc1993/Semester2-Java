/*
	Written by : Maeve Carr
	Date:
	Desc:
*/

public class EmployeeTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Employee
	   Employee emp1 = new Employee(123, "Joe bloggs");
	   Employee emp2 = new Employee(334, "Jane bloggs", 15000);
	   // use methods to check initial values
	   // use methods to retrieve values of instance variables
	   System.out.println("employee no: " + emp1.getEmpNo());
		System.out.println("Name: " + emp1.getName());
	   System.out.println("Salary: " + emp1.getSalary());   
	  
		//cant do this anymore..
		//emp1.setEmpNo(111);
	  		
   
	  // use methods to retrieve values of instance variables
	   System.out.println("employee no: " + emp2.getEmpNo());
		System.out.println("Name: " + emp2.getName());
	   System.out.println("Salary: " + emp2.getSalary());   

	 //  //check raiseSalary
// 		emp1.raiseSalary(600); 
// 		// use methods to retrieve values of instance variables
// 	  	System.out.println("after raise Salary: " + emp1.getSalary());   
// 		
// 		//check reduceSalary
// 		emp1.reduceSalary(300); 
// 		// use methods to retrieve values of instance variables
// 	 	  System.out.println("after reduction Salary: " + emp1.getSalary());  
// 		
// 		//check give bonus at 10%
// 		 System.out.println("bonus: " + emp1.calcBonus(5)); 
// 		 //check monthly and weekly salary
// 		 System.out.println("weeklyPay: " + emp1.calcWeeklyPay());  
// 		 System.out.println("MonthlyPay: " + emp1.calcMonthlyPay());    
   }
}
