// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: An example user-defined exception
package lab12;

public class InvalidAgeException extends Exception
{  
	InvalidAgeException()
	{
		super();  
	}  
	InvalidAgeException(String s)
	{
		super(s);  
	}  
} 