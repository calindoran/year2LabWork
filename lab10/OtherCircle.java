// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A Circle superclass to demonstrate inheritance

package lab10;

public class OtherCircle
{
	private double radius;
	
	public OtherCircle(double r)
	{ setRadius(r); }

	public double area()
	{ return Math.PI * Math.pow(radius, 2); }
	
	public double getRadius()
	{ return radius; }

	public void setRadius(double r)
	{ radius = r; }

	@Override
	public String toString()
	{		
		return ("Radius : " + radius);
	}
}
