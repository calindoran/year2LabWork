// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Box's
package lab7;

public class TestRectangle {

	public static void main(String[] args) 
	{
		Rectangle rec = new Rectangle();
		
		rec.setLength(15);
		rec.setWidth(5);
		
		/*System.out.println("Lenght = "+rec.getLength());
		System.out.println("Width = "+rec.getWidth());
		
		System.out.println("Area = "+rec.getArea());
		System.out.println("Perimeter = "+rec.getPerimeter());
		*/
		System.out.println(rec.toString());
		rec.printRectangle();
		

	}

}