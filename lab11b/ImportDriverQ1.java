// Author 			: Calin Doran
// Date 			: 2017
package lab11b;

public class ImportDriverQ1 {
	
	public static void main(String[] args) 
	{
		Car car = new Car("Saloon",4,6);
		Hgv hgv = new Hgv(1200,4,7);
		
		System.out.println(car.toString());
		car.calculateDuty();
		
		System.out.println(hgv.toString());
		hgv.calculateDuty();
		
		
	}

}
