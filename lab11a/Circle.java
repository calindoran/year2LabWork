// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 
package lab11a;

public class Circle extends TwoDShape
{
	private double radius;

  	public Circle(String name,String colour, double r)
  	{ 
  		super(name,colour);
  		setRadius(r); 
  	}

  	@Override
	public double area()
  	{ 
  		return Math.PI * Math.pow(radius, 2); 
  	}

  	public double getRadius()
  	{ 
  		return radius; 
  	}

  	public void setRadius(double r)
  	{ 
  		radius = r; 
  	}
  	
  	@Override
	public String toString()
  	{
  		return (super.toString() + "\nRadius = " + radius);
  	}
}
