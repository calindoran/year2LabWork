// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: CA2

package cA2;

public class Penthouse extends Luxury
{

	private String name;
	
	public Penthouse(String name, String apartmentType, int apartmentNum, int numOfRooms, int numOfPeople, double propertyTax)
	{
		super(apartmentType, apartmentNum, numOfRooms, numOfPeople, propertyTax);
		this.name = name;
	}
	
	public String pool()
	{
		return "Has a pool.";
	}
	
	@Override
	public String toString()
  	{
  		return "Penthouse Name: "+name+"\nPenthouse Pool: "+pool()+super.toString();
  	}
}
