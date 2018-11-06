// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: An example exception handling with throw
package lab12;  

public class Throw_Demo 
{ 
	public static void main (String args[]) 
	{
		int[] myArray = new int[10]; 
		try {
			myArray[100] = 1;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e = new ArrayIndexOutOfBoundsException("Please ensure your array index is within bounds.");
			throw(e); 
		}
	}
} 
