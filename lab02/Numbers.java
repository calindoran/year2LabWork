package lab2;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numb = new Scanner(System.in);
		System.out.println("Enter any Integer	:");
		int i = numb.nextInt();
		
		System.out.println("Enter any Float	:");
		float f = numb.nextFloat();
		
		System.out.println("Enter any Long	:");
		long l = numb.nextLong();
		
		System.out.println("Enter any Double	:");
		double d = numb.nextDouble();
		
		System.out.println("Enter any String	:");
		String text = numb.next();
		
		System.out.println("--- INPUTS ---");
		System.out.println("Integer	:	" +i);
		System.out.println("Float	:	" +f);	// \n for new line
		System.out.println("Long	:	" +l);
		System.out.println("Double	:	" +d);
		System.out.println("String	:	" +text);
		System.out.println("--- ADDITIONS ---");
		
		System.out.println("Integer + Float	:	" );
	}

}
