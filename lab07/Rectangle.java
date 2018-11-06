// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Box's
package lab7;

public class Rectangle 
{
	private double length;
	private double width;
	
	public double getArea() //for multi the len by wid
	{
		return length*width;
	}
	
	public double getLength() 
	{
		return length;
	}
	
	public double getPerimeter() //for getting the square to equl the perim
	{
		return length+length+width+width;
	}
	
	public double getWidth() 
	{
		return width;
	}

	public void printRectangle()
	{
		for(double i=1; i<=length; i++) //used to construct the lenght
		{
			for(double j=1; j<=width; j++) //used to construct the width
			{
				if(i==1||i==length||j==1||j==width) //if used to let i equl 1, or i equl length.. so on. 
				{
					System.out.print("*"); //prints the * in the grid once the if alowed
				}
				else
				{
					System.out.print(" "); //prints a space in the grid where else the * is not
				}
			}
			System.out.println();
		}
	}
	
	public void setLength(double len) 
	{
		length = len;
	}
	
	public void setWidth(double wid) 
	{
		width = wid;
	}
	
	@Override
	public String toString() //to print the info on the values you gave the construcers to construct the shape
	{
		return "Length = "+Double.toString(getLength())+" Width = "+Double.toString(getWidth())+"\n"+"Area = "
				+Double.toString(getArea())+" Perimeter = "+Double.toString(getPerimeter());
	}
}
