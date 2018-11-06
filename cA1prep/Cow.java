package cA1prep;

public class Cow extends Animal
{
	
	private int tagNumber;
	
	public Cow(String name, int tagNumber)
	{
		super(name);
		setTagNumber(tagNumber);
	}
	
	@Override
	public String getFeed() 
	{
		return ("Animal number "+tagNumber+" has been feed.");
	}

	public int getTagNumber() 
	{
		return tagNumber;
	}
	
	public void setTagNumber(int tagNumber) 
	{
		this.tagNumber = tagNumber;
	}

	@Override
	public String toString()
  	{
  		return super.toString() + "\nTag Number: " + tagNumber;
  	}
}
