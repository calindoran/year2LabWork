//Author 	: Calin Doran
//Date 	: 2017
//Purpose 	: Implements Cat class.

package lab6;

public class CowTest {

	public static void main(String[] args) 
	{
		
		Cow myCow = new Cow("Fudge","White and brown", "lad");
		
		System.out.println("My cow name is "+myCow.name);
		System.out.println("My cow colour is "+myCow.colour);
		System.out.println("My cow breed is "+myCow.breed);
		myCow.eat();
		myCow.says();
		myCow.sleep();
		
	}
}