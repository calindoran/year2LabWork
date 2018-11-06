// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Implements an Employee class
package lab8;
public class Employee 
{ // begin class Employee
	private static int count;  // # of objects instantiated
	private static int staffNumber = 1;
	public static int getCount() 
	{ 
		return count; 
	}
	private String firstName;
	private String lastName;

	private int employeeNumber;

	public Employee( String fName, String lName, int staffNumber )
	{
		firstName = fName;
		lastName = lName;
		++count;  // increment static count of employees
		employeeNumber=staffNumber;
		++staffNumber;
	}
	
	@Override
	public void finalize()
	{
		--count;  // decrement static count of employees
	}
	
	public int getEmployeeNumber() 
	{
		return employeeNumber;
	}
	
	public String getFirstName() 
	{ 
		return firstName; 
	}

	public String getLastName()
	{ 
		return lastName; 
	}

	public void setEmployeeNumber(int employeeNumber) 
	{
		this.employeeNumber = employeeNumber;
	} 
} // end class Employee
