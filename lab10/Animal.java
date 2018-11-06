// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A class program for our Animal class

package lab10;

public abstract class Animal { //abstract class to be override in the subclasses

	private String type;
	private int age;
	private char gender;
	

	public Animal(String animalType, int animalAge, char animalGender)
	{
		type = animalType;
		age = animalAge;
		gender = animalGender;
		
	}
	
	public void eat() 
	{
		System.out.println("Animal is eating");
	}

	public int getAge() 
	{
		return age;
	}

	public char getGender() 
	{
		return gender;
	}

	public String getType() 
	{
		return type;
	}
	
	public void makeSound()
	{
		System.out.println("Animal makes a sound");
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public void setGender(char gender) 
	{
		this.gender = gender;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	
	@Override
	public String toString()
	{
		return "Type: "+type+" "+
				"Age: "+age+" "+
				"Gender: "+gender;
	}
	
}
