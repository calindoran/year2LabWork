// Student Name 	: Calin Doran
// Student Id Number: C00220175
// Date 			: 2017
// Purpose 			: Defines the Driver class.

package test;
import java.util.Scanner;

public class myHr {

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		Employee employArray[] = new Employee[10]; // puts the employee driver into an employArray so store the informaton. 
		Car carType;
		Address employAddress;
		int userChoice;
		
		String name;
		String type;
		
		String street;
		String city;
		String county;

		String carMake;
		//int carNumber;
		
		do{
			System.out.println("1.Create new Employee");
			System.out.println("2.List all employees");
			System.out.println("3.List all non-manager employees");
			System.out.println("4.List all managers");
			System.out.println("5.List all company cars");
			System.out.println("0.Exit");
			userChoice = console.nextInt();
		
			switch(userChoice)
			{
			case 1:
				System.out.println("How many records would you like to create?");
				int empRecords = console.nextInt();
				for(int x=0; x<empRecords; x++)
				{
					System.out.println("Enter name: ");
					name = console.next();
					System.out.println("Enter type: ");
					type = console.next();
					carType = null;
					if (type.equalsIgnoreCase("Manager"))
					{
						System.out.println("Enter car type: ");
						carMake = console.next();
						/*
						 * System.out.println("Enter car number: ");
						 * carNumber = console.nextInt();
						*/
						carType = new Car(carMake); // <put carnumb in here if want to number the car yourself.
					}
					System.out.println("Enter Street: ");
					street = console.next();
					System.out.println("Enter city: ");
					city = console.next();
					System.out.println("Enter county: ");
					county = console.next();
					employAddress = new Address(street,city,county);
					employArray[x] = new Employee(name, type, employAddress, carType);
				}
				break;
			case 2:
				for(int x=0; x<Employee.getNumbOfEmployees(); x++)
					{
						System.out.println(employArray[x]);
					}
				break;
			case 3:
				System.out.println("List of non-managers: \n");
				for (int x=0; x<Employee.getNumbOfEmployees(); x++)
				{
					if (!employArray[x].getEmployeeType().equalsIgnoreCase("Manager")) // ! at the start for the not version.
					{
						System.out.println(employArray[x]);
					}
				}
				break;
			case 4:
				System.out.println("List of managers: \n");
				for (int x=0; x<Employee.getNumbOfEmployees(); x++)
				{
					if (employArray[x].getEmployeeType().equalsIgnoreCase("Manager"))
					{
						System.out.println(employArray[x]);
					}
				}
				break;
			case 5:
				System.out.println("List of company Cars: " );
				for (int x=0; x<Employee.getNumbOfEmployees(); x++)
				{
					if (employArray[x].getEmployeeType().equalsIgnoreCase("Manager"))
					{
						System.out.println(employArray[x].getEmployeeCar());
					}
				}
				break;
			case 0:
	            System.out.println("Thank you");
	            break;
			default:
	            System.out.println("Invalid Value");
			}
		}while(userChoice!=0);
		
		/*
		employArray[0] = new Employee("Name","Type","Street","City","County",null);
		employArray[1] = new Employee("Calin Doran","Staff","100 Street","Wexford","County Wexford",newCar);
		
		for(int i=0; i<10; i++)
		{
			System.out.println(employArray[i]);
		}
		
		Record employeeList = new Record("Employee(s): ");
		employeeList.employeeRecord[0]=employee1;
		employeeList.AddEmployee(employee1);
		
		Address employeeAddress = new Address();
		employeeAddress.getStreet(employee1);
		employeeAddress.getCity();
		employeeAddress.getCounty();
		
		System.out.println(employee1.toString());
		System.out.println(employeeAddress.toString());
		System.out.println(employeeList.toString());
		*/
	}
}
