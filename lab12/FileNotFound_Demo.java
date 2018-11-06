// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: An example checked exception
package lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound_Demo {

	public static void main(String args[]) throws FileNotFoundException 
   	{		
    	File file = new File("E://file.txt");
		FileReader fr = new FileReader(file); 
   	}
}


