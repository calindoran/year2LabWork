// Author 	: Calin Doran
// Date 	: 2017
// Purpose 	: Implements a Dog class.
package lab6;

public class Dog
{ // begin Dog
	public String name;// name is accessible to all methods in this class
	public String colour;
	public String breed;
	public String eat;
	public String sleep;
	public String bark;
	
	public Dog(String dogsName, String dogsColour, String dogsBreed, String dogsEat, String dogsSleep, String dogsBark)			// constructor method #1
	{
		name = dogsName;
		colour = dogsColour;
		breed = dogsBreed;
		eat = dogsEat;
		sleep = dogsSleep;
		bark = dogsBark;
	}
		
} // end class Dog
