// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 
package lab11a;

public class Rectangle extends TwoDShape
{
	private double length;
	private double breadth;

  	public Rectangle(String name,String colour, double length, double breadth)
  	{ 
  		super(name,colour);
  		setLength(length); 
  		setBreadth(breadth); 
  	}

  	@Override
	public double area()
  	{ 
  		return length * breadth; 
  	}

  	public double getBreadth()
  	{ 
  		return breadth; 
  	}

	public double getLength()
  	{ 
  		return length; 
  	}

  	public void setBreadth(double breadth)
  	{ 
  		this.breadth = breadth; 
  	}
  	
  	public void setLength(double length)
  	{ 
  		this.length = length; 
  	}
  	
  	@Override
	public String toString()
  	{
  		return (super.toString() + "\nLength = " + length + "\nBreadth = " + breadth);
  	}
}
