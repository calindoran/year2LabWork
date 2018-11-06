package cA1prep;

public class Farm 
{
	private String name;
	private Machine[] farmMachine;
	private Animal[] farmAnimal;
	
	public Farm(String name, Machine[] farmMachine, Animal[] farmAnimal)
  	{ 
  		this.name = name;
  		this.farmMachine = farmMachine;
  		this.farmAnimal = farmAnimal;
  	} 
  	
  	@Override
	public String toString()
  	{
  		for(Machine x: farmMachine)
		{
			System.out.println(x);
		}
  		
		for(Animal y: farmAnimal)
		{
			System.out.println(y);
		}
		
  		return "Farm name: "+name;
  	}
  	
}
