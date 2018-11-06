package extraclasses;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		do {
		
		System.out.println("File name your searching for?");
		
		String fileSearch = scan.nextLine();
		System.out.println(fileSearch);
		
	    try {
			scan2 = new Scanner(new File(fileSearch));
		} catch (FileNotFoundException e) {
			System.out.println("File dos not exsit");
		}
	    
	    try {
	    	for(int i=0; i<0; i++)
	    	{
	    		System.out.println(scan2.next());
	    	}
	    }
	    catch(NoSuchElementException e)
	    {
	    	System.out.println();
	    }
		}
		while(scan2 == null);
		{
			System.out.println("Enter vaild file name");
		}
	}
}