// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: CA2

package cA2;

public class Apartment 
{
	private String apartmentType;
	private int apartmentNum;
	private int numOfRooms;
	private int numOfPeople;
	private double propertyTax;
	
	public Apartment(String apartmentType, int apartmentNum, int numOfRooms, int numOfPeople, double propertyTax)
	{
		this.setApartmentType(apartmentType);
		this.apartmentNum = apartmentNum;
		this.numOfRooms = numOfRooms;
		this.numOfPeople = numOfPeople;
		this.propertyTax = propertyTax;
	}
	
	public int getApartmentNum() 
	{
		return apartmentNum;
	}

	public String getApartmentType() 
	{
		return apartmentType;
	}
	
	public int getNumOfPeople() 
	{
		return numOfPeople;
	}
	
	public int getNumOfRooms() 
	{
		return numOfRooms;
	}
	public double getPropertyTax() 
	{
		return propertyTax;
	}
	
	public void setApartmentNum(int apartmentNum) 
	{
		this.apartmentNum = apartmentNum;
	}
	
	public void setApartmentType(String apartmentType) 
	{
		this.apartmentType = apartmentType;
	}
	
	public void setNumOfPeople(int numOfPeople) 
	{
		this.numOfPeople = numOfPeople;
	}
	
	public void setNumOfRooms(int numOfRooms) 
	{
		this.numOfRooms = numOfRooms;
	}
	
	public void setPropertyTax(double propertyTax) 
	{
		this.propertyTax = propertyTax;
	}
	
	@Override
	public String toString()
  	{
  		return "\nApartment Type: "+apartmentType+"\nApartment Number: "+apartmentNum+"\nNumber of Rooms: "+numOfRooms+"\nNumber of People: "+numOfPeople+"\nProperty Tax cost: "+propertyTax;
  	}
}