// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A driver to demonstrating inheritance
package lab10;

import lab11b.Car;
import lab11b.Hgv;

public class RoadTest {

	public static void main(String args[])
	{
		Car car1 = new Car("Saloon",4,6);
		Car car2 = new Car("People carrier",4,7);
		
		System.out.println("Car1");
		System.out.println(car1.toString());
		System.out.println("Car2");
		System.out.println(car2); //auto looks for the toString in the car class and prints.
		
		Hgv truck1 = new Hgv(3200,18,2);
		Hgv truck2 = new Hgv(1200,6,3);
		
		System.out.println("Truck1");
		System.out.println(truck1);
		System.out.println("Truck2");
		System.out.println(truck2);
	}
}
