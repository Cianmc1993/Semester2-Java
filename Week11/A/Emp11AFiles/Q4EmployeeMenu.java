/*
	Written by : Maeve Carr
	Date:
	Desc:
*/
import java.util.*;
public class Q4EmployeeMenu
{
   public static void main(String [] args)
   {  
	   			  	
		Scanner keyIn = new Scanner(System.in);
		//create an arrayList of employee object
		ArrayList<Employee> empList = new ArrayList<Employee>();
		String name;
		int option, idNo;
		double sal;  
      boolean found; 
		
		do{
			//display menu on screen
			System.out.println("\n  MAIN MENU "    );
			System.out.println("1. View all employees\n2. Add employee\n3. Remove employee\n0. Exit"    );

			System.out.print("Enter your option: "); 
			option  = keyIn.nextInt();
			
			switch(option)
			{
				case 1:	System.out.println("\nEmployee Details: ");
							for(int i = 0; i < empList.size(); i++)
							{
								System.out.println(empList.get(i)); //can only do this because of toString()
							} 

						break;
				case 2:	System.out.print("Enter employee name :"    );
							keyIn.nextLine();//clears the buffer
							name = keyIn.nextLine();
							System.out.print("Enter starting salary :"    );
							sal = keyIn.nextDouble();

							//create an employee object
							Employee e = new Employee(name, sal); 
			
							//add the employee object to the arraylist
							empList.add(e);  

						break;
				case 3:  //remove employee
							System.out.print("Enter employee ID: ");
            			idNo = keyIn.nextInt();
                     //must find employee first 
                     //then remove
                                  
						break;
				case 0:
						break;
				default: 
						System.out.println("Invalid option entered.");		
			}//end switch
							
		}while(option != 0); 
	
	
	} 

}
