// Student Name 	: Calin Doran
// Student Id Number: C00220175
// Date 			: 2017
// Purpose 			: Defines the Car class.

package test;

public class Car {
	
	private static int numbOfCars = 0;
	public static int getNumbOfCars() 
	{
		return numbOfCars;
	}
	public static void setNumbOfCars(int numbOfCars) 
	{
		Car.numbOfCars = numbOfCars;
	}
	
	
	private int carNumb;

	private String type;

	public Car(String type)
	{
		this.type=type;
		carNumb = numbOfCars+100;
		numbOfCars++;
	}
	
	public int getCarNumb() 
	{
		return carNumb;
	}

	public String getType() 
	{
		return type;
	}

	public void setCarNumb(int carNumb) 
	{
		this.carNumb = carNumb;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return "\nMake: "+type+"\nNumber: "+carNumb+"\nNumber of Cars: "+numbOfCars;
	}

	
}
