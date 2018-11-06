package TestQuestion;

import java.util.Scanner;

public abstract class testQuestion 
{
	
	protected abstract String question();
	protected abstract void readQuestion(Scanner Scan);
	@Override
	public abstract String toString();
	
}
