// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A class program for our Animal class

package lab10;

public class Vet {
	
	private String name;
	private Animal vaccinate;
	
	public Vet(String name)
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}

	public Animal getVaccinate() 
	{
		return vaccinate;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setVaccinate(Animal vaccinate) 
	{
		this.vaccinate = vaccinate;
	}

	public void vaccinate()
	{
		System.out.println(name+" is vaccinating.");
		
	}

}
