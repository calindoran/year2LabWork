package lab6;
//Author 	: Calin Doran
//Date 	: 2017
//Purpose 	: Implements Cat class.

public class CatTest 
{

	public static void main(String[] args) 
	{
		//Cat myCat = new Cat("Lucy", "Black", "Bombay", null, null, null);
		//System.out.println("My cats name is " + myCat.name);
		//System.out.println("My cats colour is " + myCat.colour );
		//System.out.println("My cats breed is " + myCat.breed);
		
		Cat myOtherCat = new Cat("Fluffy","White", "Kitter", "Noms", "Naps", "Prrrr");
		
		System.out.println("My cats name is "+myOtherCat.name);
		System.out.println("My cats colour is "+myOtherCat.colour);
		System.out.println("My cats breed is "+myOtherCat.breed);
		System.out.println("My cat eats "+myOtherCat.eat);
		System.out.println("My cat takes "+myOtherCat.sleep);
		System.out.println("My cat says "+myOtherCat.prrrr);
	}
}