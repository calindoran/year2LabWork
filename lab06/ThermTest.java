// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Thermometer
package lab6;

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.display();
		
		Thermometer thermB = new Thermometer();
		double tempB = thermB.getCelsius();
		
		thermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
		thermB.display();
		
		tempB = thermB.getFahrenheit(100);	//Should be 50F if set to 10C
		System.out.println("Temp. of Thermometer B in Fahrenheit is "+ tempB);
		thermB.setFahrenheit(100);	//37.77 in Celsius
		tempB = thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is " + tempB);

		tempB = thermB.getKelvin(30);
		System.out.println("Temp. of Therm B in Cel is "+tempB);
		tempB = thermB.setKelvin(30);
		System.out.println("Temp. of Therm B in Kel is "+tempB);
		
	} // end main
} // end class ThermTest
