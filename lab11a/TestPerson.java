// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 

package lab11a;
import java.util.Scanner;


public class TestPerson
{
	public static void main(String[] args) 
	{
		Person personArray[] = new Person[10];
		Scanner console = new Scanner(System.in);
		String name;
		double x;
		
		System.out.println("How many records would you like to create?");
		int records = console.nextInt();
		
		for(int i=0; i>records; i++)
		{
			System.out.println("Enter name: ");
			name = console.next();
			System.out.println("Enter Salary: ");
			x = console.nextDouble();
			personArray[i] = new Employee(name, x);
		}
		
		/*
		Employee employee = new Employee("Lad",1000.0);
		Student student = new Student("Boi","Computers");
		
		System.out.println("\nUsing employee stuff "+employee.toString());
		System.out.println("\nUsing student stuff "+student.toString());
		*/
	}

}
