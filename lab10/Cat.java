// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A class program for our Animal class

package lab10;

public class Cat extends Animal
{
	private String name;
	
	/*public Cat()
	{
		this("","",0,'');
	}*/
	
	public Cat(String name,String type,int age,char gender)
	{
		super(type,age,gender);
		setName(name);
		
	}
	@Override
	public void eat() 
	{
		System.out.println("Kitter is eating");
	}

	public String getName() 
	{
		return name;
	}
	@Override
	public void makeSound()
	{
		System.out.println("Kitter meows.. B^)");
	}
	public void prrrr()
	{
	     System.out.println("Kitter is prrring");
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	@Override
	public void sleep()
	{
		System.out.println("Kitter is sleeping");
	}
	@Override
	public String toString()
	{
		return "Name: "+name+""+super.toString();
	}

}
