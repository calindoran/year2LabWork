// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Class program.

package lab9;

import java.util.Random;

public class Dice 
{
	private int sides;
	private int sideValue;
	

	public Dice(int sides) 
	{
		setSides(sides);
		roll();
	}

	public int getSides() 
	{
		return sides;
	}

	public int getSideValue() 
	{
		return sideValue;
	}

	public void roll() 
	{
		Random rand = new Random();
		sideValue = rand.nextInt( (getSides() - 1) + 1) + 1 ;
	}

	public void setSides(int sides) 
	{
		this.sides = sides;
	}

	public void setSideValue(int sideValue) 
	{
		this.sideValue = sideValue;
	}

}
