// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
//Driver program to test the Time class.

package lab8;
import java.util.Calendar;
public class Clock {
	
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		long startTime = System.currentTimeMillis();
		long currentTime = System.currentTimeMillis();
		
		
		for(int i = 0; i<currentTime; i++)
		{
			while(currentTime-startTime<1000)
			{
				currentTime=System.currentTimeMillis();
			}
			
			t.tick();
			startTime=currentTime;
			System.out.println(t.toString());
		}
		
	}

}
