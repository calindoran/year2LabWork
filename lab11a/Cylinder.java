// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 
package lab11a;

public class Cylinder extends ThreeDShape
{
  	private double height;
  	private double radius;

  	public Cylinder(String name,String colour, double radius, double height)
  	{ 
    	super(name,colour); 
    	setRadius(radius);
    	setHeight(height);
  	}

  	@Override
	public double area()
  	{ 
  		return 2 * Math.PI * radius * height; 
  	}

  	public double getHeight()
  	{ 
  		return height; 
  	}

	public double getRadius()
  	{ 
  		return radius; 
  	}

  	public void setHeight(double height)
  	{ 
  		this.height = height; 
  	}
  	
  	public void setRadius(double r)
  	{ 
  		radius = r; 
  	}
  	
	@Override
	public String toString()
  	{
  		return (super.toString() + "\nRadius = " + radius + "\nHeight = " + height);
  	}
	
	@Override
	public double volume()
	{
		return Math.PI * Math.pow(radius, 2) * height; 
	}

}
