// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 
package lab11a;

public abstract class TwoDShape extends Shape
{
	public TwoDShape(String name,String colour)
  	{ 
  		super(name,colour); 
  	}
 
  	@Override
	public abstract double area();
  	
  	@Override
	public String toString()
  	{
  		return (super.toString());
  	}
}
