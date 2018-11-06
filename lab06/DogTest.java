// Author 	: Calin Doran
// Date 	: 2017
// Purpose 	: Tests our Dog class.
package lab6;

public class DogTest
{ // begin DogTest

	public static void main(String args[]) 
	{ // being main method

		Dog myDog = new Dog("Sandy", "Brown", "Colie", "Kibbles", "Sleepy", "Wooff!");		// Create an instance of our Dog class

		System.out.println("My dog's name is " + myDog.name);
		System.out.println("My dog's colour is " + myDog.colour );
		System.out.println("My dogs breed is " + myDog.breed);
		System.out.println("My dog eats "+myDog.eat);
		System.out.println("My dog is "+myDog.sleep);
		System.out.println("My dog says "+myDog.bark);
		
		//Dog myOtherDog = new Dog("Fluffy","White", "Doggo", null, null, null);
		//System.out.println("My dog's name is "+myOtherDog.name);
		//System.out.println("My dogs colour is "+myOtherDog.colour);
		//System.out.println("My dogs breed is "+myOtherDog.breed);

	} // end main
} // end class DogTest
