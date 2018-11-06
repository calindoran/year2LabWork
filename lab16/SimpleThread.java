package lab16;

public class SimpleThread extends Thread 
{

	public static int num = 100;
	
	public SimpleThread()
	{
		this("" + num++); 
	}
	
	public SimpleThread(String name) 
	{
		super(name);
		System.out.println("Thread "+this.getName()+"is Alive");
		
	}
	
	@Override
	public void run()
	{
		System.out.println("Thread "+this.getName()+" is running");
	}
}
