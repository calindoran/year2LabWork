// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Driver for Dice.

package lab9;

public class Roll {

	public static void main(String[] args) 
	{
		Dice r = new Dice (20);
		Dice y = new Dice (6);
		
		System.out.println("Dice 1: "+r.getSideValue());
		System.out.println("Dice 2: "+y.getSideValue());

	}

}
