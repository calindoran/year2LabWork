/*ParseInts.java
 * 
 * Prompts for and reads in a line of input
 * Uses second scan to take input line one token at a time and parses an interger from each token as extracted
 * Sums the ints
 * Prints the sum
 * 
 */

package exceptions;

import java.util.Scanner;

public class ParseInts {

public static void main(String[] args) {
		
		int val, sum=0;
		Scanner scan = new Scanner(System.in);
		String line;
		
		System.out.println("Enter a line of text: ");
		Scanner scanLine = new Scanner(scan.nextLine());
		
		while (scanLine.hasNext())
		{
			try
			{
			val = Integer.parseInt(scanLine.next());
			sum += val;
			}
			catch(NumberFormatException e)
			{
			}
		}
		System.out.println("The sum of the integers on this line is "+sum);
	}
}
