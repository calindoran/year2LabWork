package cA1prep;

public abstract class Machine
{
	private String name;
	
	public Machine(String name) 
	{
		this.name = name;
	}

	public abstract String getServiced();

	@Override
	public String toString()
  	{
  		return name;
  	}
}
