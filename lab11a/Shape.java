// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 
package lab11a;

public abstract class Shape
{
	private String name;
	private String colour;
	
	public Shape(String name,String colour)
  	{ 
  		this.name = name; 
  		this.colour = colour;
  	} 
  	
  	public abstract double area();
  	
  	@Override
	public String toString()
  	{
  		return ("---\nShape Name = " + this.name+"\nShape Colour = "+this.colour);	
  	}
}
