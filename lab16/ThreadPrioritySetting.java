// Author: 	Oisin Cawley
// Date: 	March 2017
// Purpose:	Demonstrates the setting of a Thread's priority.
package lab16;

public class ThreadPrioritySetting extends Thread
{

	public static void main(String[] args) throws InterruptedException
	{

		System.out.println("Minimum Thread Priority = " + Thread.MIN_PRIORITY);
		System.out.println("Defualt Thread Priority = " + Thread.NORM_PRIORITY);
		System.out.println("Maximum Thread Priority = " + Thread.MAX_PRIORITY);
		System.out.println();		

		ThreadPrioritySetting t0 = new ThreadPrioritySetting();
		ThreadPrioritySetting t1 = new ThreadPrioritySetting();
		ThreadPrioritySetting t2 = new ThreadPrioritySetting();

		t1.setPriority(Thread.MAX_PRIORITY);
		t0.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);

		t0.start();
		t1.start();
		t2.start();

	}

	@Override
	public void run()
	{
		String tName = Thread.currentThread().getName(); 	// Could also use this.getName();
		Integer tPriority = Thread.currentThread().getPriority();

		System.out.println(tName + " has priority " + tPriority);
	}
}