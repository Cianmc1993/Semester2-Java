/*
	Written by : Maeve Carr
	Date:
	Desc:
*/


// Employee class


public class Employee
{
	// instance variables
	private int empNo;
	private double salary;
	private String name;

	public Employee(int empNoIn, String nameIn)
	{
		empNo = empNoIn;
		name = nameIn;
		salary = 0.0; 
	}
	
	public Employee(int empNoIn, String nameIn, double salaryIn)
	{
		empNo = empNoIn;
		name = nameIn;
		salary = salaryIn;
	}

	
	// methods
	
	
	public int getEmpNo()
	{	
		return empNo;		
	}

	public void setName(String nameIn)
	{	
		name  = nameIn;		
	}
	
	public String getName()
	{	
		return name;		
	}
	
	public void setSalary(double salaryIn)
	{	
		salary  = salaryIn;		
	}
	
	public double getSalary()
	{	
		return salary;		
	}
	
	public void raiseSalary(double raise)
	{
		salary += raise;
	}
	
	public void reduceSalary(double reduction)
	{
		salary -= reduction;
	}
	public double calcMonthlyPay()
	{
		return salary/12;
	}
	
	public double calcWeeklyPay()
	{
		return salary/52;
	}
	public double calcBonus(double percentBonus)
	{
		return  salary * (percentBonus/100);
	}


}// end of class