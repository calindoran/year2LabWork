// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: An example try/catch exception with finally block
package lab12;

public class FinallyBlock_Demo 
{ 
	public static void main(String args[])
		{
			try {
				System.out.println("First statement of try block");
				int num=45/0;
				System.out.println(num);
			}
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException: " + e);
			}
			finally {
				System.out.println("Inside the finally block");
			}
			System.out.println("Out of try-catch-finally block");
		}
}