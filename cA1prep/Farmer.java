package cA1prep;

public class Farmer 
{

	public static void main(String[] args) 
	{
	
		
		Machine[] machineArray = new Machine[2];
		Animal[] animalArray = new Animal[2];
		
		Tractor tractor = new Tractor("Tractor Brand", 187321);
		Cow cow = new Cow("Daisy the cow", 12873);
		
		machineArray[0] = tractor;
		animalArray[0] = cow;
		
		Farm myFarm = new Farm("Dah Farm",machineArray,animalArray);
		
		System.out.println(myFarm);
  		
	}
}
