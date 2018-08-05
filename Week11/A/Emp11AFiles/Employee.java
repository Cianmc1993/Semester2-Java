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
	private static int nextIDNo = 1111;
	private static double bonusRate = 5.5;

	public Employee(String nameIn)
	{
		empNo = nextIDNo++;
		name = nameIn;
		salary = 0.0; 
	}
	
	public Employee(String nameIn, double salaryIn)
	{
		empNo = nextIDNo++;
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
	//overload calcBonus
	public double calcBonus()
	{
		return  salary * (bonusRate/100);
	}

	
	//override the toString method
	public String toString()
	{
		String s = "Employee ID No: " +empNo +"\nName: " 
				+name +"\nSalary: " +salary +"\n\n"; 
				
		return s; 
	}
	
	//override the equals method
	public boolean equals(Employee e)
	{
		return empNo == e.empNo && salary == e.salary
					&& name.equalsIgnoreCase(e.name);   //NOTE use of String method equals.
		//NOTE : you may decide that employees are deemed the same if they have same ID no 
		//and same Name - regardless of salary....
	}
	
	//example of static method
	public static void setBonusRate(double bonusRateIn)
	{
		bonusRate = bonusRateIn;
	}
	
	public  double getBonusRate()
	{
		return bonusRate ;
	}



}// end of class