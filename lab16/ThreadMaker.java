package lab16;

public class ThreadMaker extends SimpleThread
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
		
		SimpleThread tm = new SimpleThread( );
		//tm.start(); 

		//System.out.println("Goodbye from ThreadMaker!");
		
		System.out.println(tm.getState());
		tm.start();
		System.out.println(tm.getState());
		System.out.println("Goodbye from ThreadMaker.");
		for (int i=0; i<10; i++)
		{
			System.out.println(tm.getState());
		}

	}
}
