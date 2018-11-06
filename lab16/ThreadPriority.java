// Author: 	Oisin Cawley
// Date: 	March 2017
// Purpose:	Demonstrates the creation of a Thread class with default priority.
package lab16;

public class ThreadPriority extends Thread
{

	public static void main(String[] args) throws InterruptedException
	{

		System.out.println("Minimum Thread Priority = " + Thread.MIN_PRIORITY);
		System.out.println("Defualt Thread Priority = " + Thread.NORM_PRIORITY);
		System.out.println("Maximum Thread Priority = " + Thread.MAX_PRIORITY);

		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();

		t1.start();
		t2.start();

	}

	@Override
	public void run()
	{
		System.out.println("My current priority is: " + this.getPriority());
	}
}