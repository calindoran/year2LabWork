// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: CA2

package cA2;

public class Multiplex extends Luxury
{

	public Multiplex(String apartmentType, int apartmentNum, int numOfRooms, int numOfPeople, double propertyTax)
	{
		super(apartmentType, apartmentNum, numOfRooms, numOfPeople, propertyTax);
	}
	
	public String multilevel()
	{
		return "Has two floors.";
	}
	
	@Override
	public String toString()
  	{
  		return super.toString()+"\nMuti-leveled: "+multilevel();
  	}
}
