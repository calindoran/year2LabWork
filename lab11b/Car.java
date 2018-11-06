// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A Car class demonstrating inheritance
package lab11b;
public class Car extends RoadVehicle
{
	private String carType;

	public Car() {
	 	this("", 0, 0); } //this is the default values for the class

	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
	}
	
	@Override
	public void calculateDuty() 
	{
		System.out.println(CARTAXRATE*super.getPass());
		
	}

	public String getType() {
		return carType;
	}

	public void setType(String t)  {
		carType = t;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+/*"Wheels: "+getWheels()+" Passegers: "+getPass()+*/" Type: "+carType;
	}
}
