/*
** Author: CD	Date: October 2017
** Lab Exercise 5 Class Work
*/

package lab5;

public class lab5Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(sum100());
		
	}

	public static int sum100()
	{
		int sum=0;
		int y=0;
		
		for(int i=1; i<=100; i++)
		{
			sum+=i;
			//System.out.println(sum); //for printing out all the values
		}
		return sum;
	}
}
