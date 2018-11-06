// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A test driver program for our
//					: Point/Circle inheritance

package lab10;

public class MyFirstCircle
{
		public static void main (String args[])
		{
			Point myPoint = new Point(10, 20);

			Circle myCircle = new Circle(15, 30, 5);

			System.out.println("Point details : " + myPoint);
			System.out.println("Circle details: " + myCircle);

		}
}
