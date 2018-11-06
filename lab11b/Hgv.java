// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A Hgv class demonstrating inheritance
package lab11b;
public class Hgv extends RoadVehicle
{
	private int cargo;

	public Hgv()
	{ 	this(0,0,0);	}

	public Hgv(int c, int w, int p)
	{ 
		super(w, p);
		setCargo(c);
	}
	
	@Override
	public void calculateDuty() 
	{
		System.out.println(HGVTAXRATE*super.getPass());
		
	}

	public int getCargo()
	{
		return cargo;
	}

	public void setCargo(int size)
	{
		cargo = size;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Cargo: "+cargo;
	}
}
