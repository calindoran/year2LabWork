// Student Name 	: Calin Doran
// Student Id Number: C00220175
// Date 			: 2017
// Purpose 			: Defines the Employee class.

package test;

public class Employee {
	
	private static int numbOfEmployees = 0;
	public static int getNumbOfEmployees() 
	{
		return numbOfEmployees;
	}
	public static void setNumbOfEmployees(int numbOfEmployees) 
	{
		Employee.numbOfEmployees = numbOfEmployees;
	}
	private String name;
	private int employeeNumb;
	private String employeeType;
	

	private Address employeeAddress; // address class can be used like an Int.
	private Car employeeCar;

	public Employee(String name,String employeeType, Address employeeAddress, Car employeeCar)
	{
		this.name = name;
		this.employeeType = employeeType;
		employeeNumb = numbOfEmployees+1000; //internal variables.
		numbOfEmployees++;
		this.employeeAddress = employeeAddress;
		this.employeeCar = employeeCar;
		/*
		 * employeeCar = new Car(cType);
		 * employeeAddress = new Address(Street, City, County); // this is where the address class is used to create a new object whit variables.
		*/
	}

	public Car getEmployeeCar() 
	{
		return employeeCar;
	}

	public int getEmployeeNumb() 
	{
		return employeeNumb;
	}

	public String getEmployeeType() 
	{
		return employeeType;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setEmployeeCar(Car employeeCar) 
	{
		this.employeeCar = employeeCar;
	}

	public void setEmployeeNumb(int employeeNumb) 
	{
		this.employeeNumb = employeeNumb;
	}
	
	public void setEmployeeType(String employeeType) 
	{
		this.employeeType = employeeType;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Employee Name: "+name+"\nEmployee Number: "+employeeNumb +"\nEmployee Type: "+employeeType+"\nAddress: "+employeeAddress;
	}

	
}
