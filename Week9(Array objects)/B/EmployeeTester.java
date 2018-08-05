/*
 Written by : Maeve Carr
 Date:
 Desc:
*/
/*excuse the untidiness but ..
commenting out code that I don't need for the moment
as I only want to test equals() and toString()
but leaving in as I may want to test again
*/

public class EmployeeTester
{
   public static void main(String [] args)
   {  
    // create an instance of type Employee
    Employee emp1 = new Employee("Joe bloggs");
    Employee emp2 = new Employee("Jane bloggs", 15000);
    // use methods to check initial values
    // use methods to retrieve values of instance variables
    // System.out.println("employee no: " + emp1.getEmpNo());
//   System.out.println("Name: " + emp1.getName());
//     System.out.println("Salary: " + emp1.getSalary());   
   
  //cant do this anymore..
  //emp1.setEmpNo(111);
    
  //test toString(); 
   System.out.println("employee Details: ");
   System.out.println(emp2);
   System.out.println(emp1);
    
  //check equals 
  if(emp1.equals(emp2))
   System.out.println(" emp1 and emp2 are the same"); //you would use to check for an existing emp and then do something
  else
   System.out.println(" emp1 and emp2 are different"); //or do something else - maybe add to list if not already in the list or whatever...
  
  Employee emp3 = new Employee("Joe bloggs"); 
  
  if(emp1.equals(emp3))
   System.out.println(" emp1 and emp2 are the same"); //you would use to check for an existing emp and then do something
  else
   System.out.println(" emp1 and emp2 are different"); 
   
   // use methods to retrieve values of instance variables
   //  System.out.println("employee no: " + emp2.getEmpNo());
//   System.out.println("Name: " + emp2.getName());
//     System.out.println("Salary: " + emp2.getSalary());   
// 
  //  //check raiseSalary
//   emp1.raiseSalary(600); 
//   // use methods to retrieve values of instance variables
//     System.out.println("after raise Salary: " + emp1.getSalary());   
//   
//   //check reduceSalary
//   emp1.reduceSalary(300); 
//   // use methods to retrieve values of instance variables
//      System.out.println("after reduction Salary: " + emp1.getSalary());  
//   
//   //check give bonus at 10%
//    System.out.println("bonus: " + emp1.calcBonus(5)); 
//    //check monthly and weekly salary
//    System.out.println("weeklyPay: " + emp1.calcWeeklyPay());  
//    System.out.println("MonthlyPay: " + emp1.calcMonthlyPay());    
   }
}