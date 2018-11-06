// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: CA2

package cA2;

public class Standard extends Classic
{

	public Standard(String apartmentType, int apartmentNum, int numOfRooms, int numOfPeople, double propertyTax)
	{
		super(apartmentType, apartmentNum, numOfRooms, numOfPeople, propertyTax);
	}
	
	public String balcony()
	{
		return "Has balcony.";
	}
	
	@Override
	public String toString()
  	{
  		return super.toString()+"\nApartment Balcony: "+balcony();
  	}
}
