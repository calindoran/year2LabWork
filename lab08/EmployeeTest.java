// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Test Employee class with static class variable,
// 					  static class method, and dynamic memory.
package lab8;
public class EmployeeTest  
{      
	public static void main( String args[] ) 
	{
		System.out.println( "Employees before instantiation: " + Employee.getCount());
		Employee e1 = new Employee( "Susan", "Baker", 1 );
		Employee e2 = new Employee( "Bobby", "Jones", 2 );
		Employee e3 = new Employee( "Jammy", "Lads", 3 );
		
		System.out.println( "Employees after instantiation: " + Employee.getCount());
		System.out.println( "Employee 1: " + e1.getFirstName() + " " + e1.getLastName() +" "+ "Staff Number : " + e1.getEmployeeNumber());
		System.out.println( "Employee 2: " + e2.getFirstName() + " " + e2.getLastName() +" "+ "Staff Number : " + e2.getEmployeeNumber());
		System.out.println( "Employee 3: " + e3.getFirstName() + " " + e3.getLastName() +" "+ "Staff Number : " + e3.getEmployeeNumber());
		
		e1 = null;
		e2 = null;
		e3 = null;
		
		System.gc();  // explicit call to garbage collector
		
		while(Employee.getCount()>0); // when the count gets to 0, prints statment. >graterthan>
		
		System.out.println( "Employees after garbage collection: " + Employee.getCount());
	}
}
