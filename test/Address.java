// Student Name 	: Calin Doran
// Student Id Number: C00220175
// Date 			: 2017
// Purpose 			: Defines the Address class.

package test;

public class Address {

	private String Street;
	private String City;
	private String County;
	
	public Address(String Street, String City, String County)
	{
		this.Street=Street;
		this.City=City;
		this.County=County;
		
	}
	
	public String getCity() 
	{
		return City;
	}
	
	public String getCounty() 
	{
		return County;
	}

	public String getStreet() 
	{
		return Street;
	}

	public void setCity(String city) 
	{
		City = city;
	}

	public void setCounty(String county) 
	{
		County = county;
	}

	public void setStreet(String street) 
	{
		Street = street;
	}
	
	@Override
	public String toString()
	{
		return "\nStreet: "+Street+"\nCity: "+City+"\nCounty: "+County;
		 
	}
	
}
