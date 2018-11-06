// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A Cyclinder subclass to demonstrate inheritance

package lab10;

public class Cylinder extends OtherCircle
{
	private double height;
	public Cylinder(double r, double h)
	{
		super(r); 
		setHeight(h);
	}

	@Override
	public double area()
	{ return 2 * super.area() + 2 * Math.PI * getRadius() * height; }

	public double getHeight()
	{ return height; }

	public void setHeight(double h)
	{ height = h; }

	@Override
	public String toString()
	{
		return (super.toString() + " Height : " + height);
	}
}
