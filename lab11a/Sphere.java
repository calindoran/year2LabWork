// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 
package lab11a;

public class Sphere extends ThreeDShape
{
  	private double radius;

  	public Sphere(String name,String colour, double radius)
  	{ 
    	super(name,colour); 
    	setRadius(radius);    	
  	}

	@Override
	public double area()
  	{ 
  		return 4 * Math.PI *  Math.pow(radius, 2); 
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
	
	@Override
	public double volume()
	{
		return 4.0/3.0 * Math.PI *  Math.pow(radius, 3);
	}

}
