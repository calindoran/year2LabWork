// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A driver class for our Car inheritance class
package lab10;

import lab11b.Car;

public class CarTest
{
	public static void main(String args[])
	{
		
		Car car1 = new Car();
		
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("saloon");

		System.out.println("Car1: ");
		System.out.print("Wheels: " + car1.getWheels());
		System.out.print(" Passengers: " + car1.getPass());
		System.out.println(" Type: " + car1.getType());
	}
}
