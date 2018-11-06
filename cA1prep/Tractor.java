package cA1prep;

public class Tractor extends Machine
{

	private int assetNumber;
	
	public Tractor(String name, int assetNumber)
	{
		super(name);
		setAssetNumber(assetNumber);
	}
	
	public int getAssetNumber() 
	{
		return assetNumber;
	}

	@Override
	public String getServiced() 
	{
		return ("Tractor number "+assetNumber+" has been serviced.");
	}

	public void setAssetNumber(int assetNumber) 
	{
		this.assetNumber = assetNumber;
	}
	
	@Override
	public String toString()
  	{
  		return super.toString() + "\nAsset Number: " + assetNumber;
  	}
	
}
