//Author 	: Calin Doran
//Date 	: 2017
//Purpose 	: Implements Cat class.

package lab6;

public class Cow {

	public String name;
	public String colour;
	public String breed;
	
	public Cow(String cowsName, String cowsColour, String cowsBreed)
	{
		name = cowsName;
		colour = cowsColour;
		breed = cowsBreed;
	}
	public void eat()
	{
		System.out.println(name+" eats its food");
	}
	public void says()
	{
		System.out.println(name+" says Moo, Mmmooo...");
	}
	
	public void sleep()
	{
		System.out.println(name+ " goes to sleep");
	}
}
