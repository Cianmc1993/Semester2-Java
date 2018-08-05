
// Employee class


public class Employee{
 // instance variables
 private int empNo;
 private double salary;
 private String name;
 private static int empCounter =1;
 private static double bonusRate;

    public Employee(String nameIn)
    {
     empNo = empCounter++;
     name = nameIn;
     salary = 0.0; 
    }
    
    public Employee(String nameIn, double salaryIn)
    {
     empNo = empCounter;
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
    
    public String getName(){ 
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
    
     public double calcBonus()
    {
     return  salary * (bonusRate/100);
    }
    
    public static void setBonusRate(double bR)
    {
      bonusRate = bR;
    }
    
    
    public String toString()
    {
     String s = "Employee ID No: " +empNo +"\nName: " 
       +name +"\nSalary: " +salary; 
       
     return s; 
    }
   
    
    public boolean equals(Employee e)
    {
     return empNo == e.empNo && salary == e.salary
        && name.equalsIgnoreCase(e.name);   //NOTE use of String method equals.
     //NOTE : you may decide that employees are deemed the same if they have same ID no 
     //and same Name - regardless of salary....
    }


}// end of class