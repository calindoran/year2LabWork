// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A driver class for our Car inheritance class
package lab10;

import lab11b.Car;

public class CarTest2
{
	public static void main(String args[])
	{
		Car car1 = new Car("Saloon",4,6);
		Car car2 = new Car("People carrier",4,7);
		
		System.out.println(car1.toString());
		System.out.println(car2); //auto looks for the toString in the car class and prints.
		
		
		/*
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("saloon");

		System.out.println("Car1: ");
		System.out.print("Wheels: " + car1.getWheels());
		System.out.print(" Passengers: " + car1.getPass());
		System.out.println(" Type: " + car1.getType());
		
		
		Car car2 = new Car();
		
		car1.setWheels(4);
		car1.setPass(7);
		car1.setType("people carrier");

		System.out.println("Car1: ");
		System.out.print("Wheels: " + car2.getWheels());
		System.out.print(" Passengers: " + car2.getPass());
		System.out.println(" Type: " + car2.getType());
		*/
	}
}
