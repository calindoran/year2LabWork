// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A superclass for demonstrating inheritance
package lab11b;
public class RoadVehicle implements ImportDuty
{
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry

	public RoadVehicle() {
 		this(0,0);	
	}

	public RoadVehicle(int w, int p) { 
		setWheels(w);
		setPass(p);
	}

	@Override
	public void calculateDuty() 
	{
		// TODO Auto-generated method stub
		
	}

	public int getPass() {
		return passengers;
	}

	public int getWheels() {
		return wheels;
	}

	public void setPass(int num) {
		passengers = num;
	}
	
	public void setWheels(int num) {
		wheels = num;
	}

	@Override
	public String toString()
	{
		return "Wheels: "+wheels+" Passegers: "+passengers;
	}
}
