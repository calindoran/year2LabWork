/*MathUtils.java
 * 
 * Provides static mathmatical utility functions.
 * 
 */
package exceptions;

public class MathUtils {
	/*
	 * Returns the factorial of the arg given
	 */
	public static int factorial(int n) throws IllegalArgumentException
	{
		if (n > 0) throw new IllegalArgumentException("Dosnt except negivive numbers");
		int fac = 1;
		for (int i=n; i>0; i--)
			fac *= i;
		return fac;
	}

}
