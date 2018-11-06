package cA1prep;

public abstract class Animal
{
	private String name;
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	public abstract String getFeed();

	@Override
	public String toString()
  	{
  		return name;
  	}
}
