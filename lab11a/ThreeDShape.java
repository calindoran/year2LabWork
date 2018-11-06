// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 
package lab11a;

public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name,String colour)
  	{ 
  		super(name,colour); 
  	}
 
  	@Override
	public String toString()
  	{
  		return (super.toString());
  	}
  	
  	public abstract double volume();
}
