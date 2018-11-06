// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: An example try/catch exception with multiple catch blocks
package lab12;

public class MultipleCatchBlocks_Demo 
{ 
	public static void main(String args[]) 
	{
		try {
			int a[]=new int[7];
			a[4]=30/0;
			System.out.println("First print statement in try block");
     	}
     	catch(ArithmeticException e){
        	System.out.println("Warning: ArithmeticException");
     	}
     	catch(ArrayIndexOutOfBoundsException e){
        	System.out.println("Warning: ArrayIndexOutOfBoundsException");
     	}
     	catch(Exception e){
        	System.out.println("Warning: Some Other exception occured: " + e);
     	}
     	System.out.println("Out of try-catch block...");
  	}
}