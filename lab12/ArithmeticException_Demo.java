// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: An example try/catch exception
package lab12;
public class ArithmeticException_Demo 
{ 
	public static void main(String args[]) 
	{
		int num1, num2;
		try {
			// Try block to handle code that may cause exception
			num1 = 0;
			num2 = 62 / num1;
			System.out.println("Try block message");	//Never get here...
		} catch (ArithmeticException e) 
		{
	     	// This block is to catch divide-by-zero error
	     	System.out.println("Error: Don't divide a number by zero");
		}
		System.out.println("I'm out of try-catch block in Java.");
	}
}