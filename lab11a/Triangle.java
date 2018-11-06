// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 
package lab11a;

public class Triangle extends TwoDShape
{
	private double base;
	private double hight;
	
	public Triangle(String name,String colour, double base,double hight)
	{
		super(name,colour);
		setBase(base);
		setHight(hight);
	}

	@Override
	public double area()
	{
		return 0.5*base*hight;
	}

	public double getBase() 
	{
		return base;
	}

	public double getHight() 
	{
		return hight;
	}

	public void setBase(double base) 
	{
		this.base = base;
	}
	
	public void setHight(double hight) 
	{
		this.hight = hight;
	}
	
	@Override
	public String toString()
  	{
  		return (super.toString() + "\nBase = " + base + "\nHight = " + hight);
  	}

}
