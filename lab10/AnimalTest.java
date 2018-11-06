// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A test driver program for our Animal class

package lab10;

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Fluffy", "Poodle", 4, 'M'); //you can cast a dog class like: Dog d = (Dog) myAnimal;
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		Dog d = (Dog) dog;
		if (dog instanceof Dog)
		{
			d.wagTail();
		}
		//((Dog) dog).wagTail();
		
		System.out.println();
		
		Animal cat = new Cat("Timmy", "Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();
		((Cat)cat).prrrr(); //this is casting from the method cat, of which otherwise could not have been seen.

		System.out.println();
		
		Vet vet = new Vet("Doc.Brown");
		vet.vaccinate();
		dog = d;
		//vet.vaccinate(dog);
		
	}
}
