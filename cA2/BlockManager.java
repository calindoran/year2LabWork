// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: CA2 Driver

package cA2;

public class BlockManager 
{

	public static void main(String[] args)
	{
		Luxury[] luxAparments = new Luxury[2];
		Classic[] classicApartment = new Classic[3];
		
		Penthouse penthouse = new Penthouse("Highroller Suite","Penthouse",1, 4, 2, 1234.56);
		Multiplex multiplex = new Multiplex("Multiplex",2,3,3,1234.56);
		Standard standard1 = new Standard("Standard",3, 2, 2, 1234.56);
		Standard standard2 = new Standard("Standard",4, 2, 2, 1234.56);
		Basement basement = new Basement("Basement",5, 2, 1, 1234.56);
		
		luxAparments[0] = penthouse;
		luxAparments[1] = multiplex;
		classicApartment[0] = standard1;
		classicApartment[1] = standard2;
		classicApartment[2] = basement;
		
		ApartmentBlock block = new ApartmentBlock("Rose Hights",5, luxAparments, classicApartment);
		
		System.out.println(block.toString());
	}
}
