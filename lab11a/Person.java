// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 

package lab11a;

public abstract class Person 
{
	private String name;
	
	public Person(String name)
  	{ 
  		this.name = name; 
  	} 
  	
  	public abstract String getDescription();
  	
  	@Override
	public String toString()
  	{
  		return ("\nName = " + this.name);	
  	}

}
