// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: CA2

package cA2;

public class Basement extends Classic
{

	public Basement(String apartmentType, int apartmentNum, int numOfRooms, int numOfPeople, double propertyTax)
	{
		super(apartmentType, apartmentNum, numOfRooms, numOfPeople, propertyTax);
	}
	
	public String garden()
	{
		return "Has a garden.";
	}
	
	@Override
	public String toString()
  	{
  		return super.toString()+"\nApartment Garden: "+garden();
  	}
}
