// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: An example interface implementation
package lab11b;

public class Mammal implements Animal
{ 
	public int anotherMethod(){ return 0;} 
	@Override
	public void eat()
	{ 
		System.out.println("Mammal eats"); 
	} 
	public int otherMethod(){ return 0;} 
	@Override
	public void sleep(){
		System.out.println("Mammal sleeps"); 
	}  
} 


