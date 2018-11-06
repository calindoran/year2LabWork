// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A point class for circle

package lab10;

public class Point 
{
	
	private int x;
	private int y;
	
	public Point()
	{
		this(0,0);
	}
	
	public Point(int x, int y)
	{
		setX(x);
		setY(y);
	}

	public int getX() 
	{
		return x;
	}

	public int getY() 
	{
		return y;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public void setY(int y) 
	{
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		return " X axis: "+x+" Y axis: "+y;
	}
}
