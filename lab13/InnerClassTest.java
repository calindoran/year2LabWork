package lab13;
// Author	: Oisin Cawley
// Date		: Feb 2017
// Purpose	: Demo of an inner class

public class InnerClassTest 
{
	// inner class
	class A 
	{
		int x = y + 10;
	}
	
	private static int y = 10;

	public static void main(String[] args) 
	{
		InnerClassTest myTest = new InnerClassTest();
		A myA = myTest.new A();
		System.out.println("Value in x = " + myA.x);
	}
}
