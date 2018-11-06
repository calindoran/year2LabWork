/*
 * Author: 	Oisin Cawley
 * Date: 	Mar 2017
 * Purpose:	Demo writing to a byte stream.
*/
package lab15;
import java.io.*;

public class TestFileStream
{
	public static void main(String[] args) throws IOException
	{
		try (
			// Create an output stream to the file
			FileOutputStream output = new FileOutputStream("temp.dat");)
		{
			// Output values to the file
			System.out.println("Writing.");
			for (int i = 1; i <= 10; i++)
				output.write(i);
		}
		try (
			// Create an input stream for the file
			FileInputStream input = new FileInputStream("temp.dat");)
		{
			// Read values from the file
			System.out.println("Reading.");
			int value;
			while ((value = input.read()) != -1)
				System.out.print(value + " ");
		}
		System.out.println("Finished.");
	}
}
