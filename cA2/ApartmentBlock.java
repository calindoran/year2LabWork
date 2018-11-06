// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: CA2

package cA2;

public class ApartmentBlock 
{

	private String name;
	private int numOfApartments;
	private Luxury[] luxAparments;
	private Classic[] classicApartment;
	
	public ApartmentBlock(String name, int numOfApartments, Luxury[] luxAparments, Classic[] classicApartment)
	{
		this.name = name;
		this.numOfApartments = numOfApartments;
		this.luxAparments = luxAparments;
		this.classicApartment = classicApartment;
	}
	
	public int getNumOfApartments() 
	{
		return numOfApartments;
	}

	public void setNumOfApartments(int numOfApartments) 
	{
		this.numOfApartments = numOfApartments;
	}

	@Override
	public String toString()
  	{
  		for(Luxury x: luxAparments)
		{
			System.out.println(x);
		}
  		
		for(Classic y: classicApartment)
		{
			System.out.println(y);
		}
		
  		return "\n"+"Apartment Block name: "+name;
  	}
}
