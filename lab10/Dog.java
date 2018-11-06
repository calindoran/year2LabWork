// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A class program for our Animal class

package lab10;

public class Dog extends Animal
{
	private String name;
	
	/*public Dog()
	{
		this("","",0,'');
	}*/
	
	public Dog(String name,String type,int age,char gender)
	{
		super(type,age,gender);
		setName(name);
		
	}
	@Override
	public void eat() 
	{
		System.out.println("Dog is eating");
	}

	public String getName() 
	{
		return name;
	}
	@Override
	public void makeSound()
	{
		System.out.println("Woof woof!");
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	@Override
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}
	@Override
	public String toString()
	{
		return "Name: "+name+" "+super.toString();
	}
	public void wagTail()
	{
	     System.out.println("Tail is wagging");
	}

}
