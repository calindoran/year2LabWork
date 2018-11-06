// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A circle class

package lab10;

public class Circle extends Point
{
	private int radius;
	
	public Circle()
	{
		this(0,0,0);
	}
	
	public Circle(int radius, int x, int y)
	{
		super(x,y);
		setRadius(radius);
	}

	public int getRadius() 
	{
		return radius;
	}

	public void setRadius(int radius) 
	{
		this.radius = radius;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Radius: "+radius;
	}

}
