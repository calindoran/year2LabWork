// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Thermometer
package lab6;

public class test {

	public static void main(String[] args) 
	{
		Thermometer thermA = new Thermometer(21.5);
		double tempA = thermA.getCelsius();
    	System.out.println("Thermometer A:");
    	System.out.println("Temperature in Celsius is "+thermA);
    	tempA = thermA.getFahrenheit(tempA);
    	System.out.println("Temperature in Fahrenheit is "+tempA);
    	
	}

}
