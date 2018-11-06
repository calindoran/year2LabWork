/*
 * Author: Calin Doran
 * Date: 2018
 * Use: CA4
 */

package cA4;

public class Boat // Boat super class.
{
	private String boatName;
	private String boatType;
	private int numOfStaff;

	public Boat(String boatName, String boatType, int numOfStaff) {
		this.boatName = boatName;
		this.boatType = boatType;
		this.numOfStaff = numOfStaff;
	}

	public String getBoatName() {
		return boatName;
	}

	public String getBoatType() {
		return boatType;
	}

	public int getNumOfStaff() {
		return numOfStaff;
	}

	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	public void setBoatType(String boatType) {
		this.boatType = boatType;
	}

	public void setNumOfStaff(int numOfStaff) {
		this.numOfStaff = numOfStaff;
	}

	@Override
	public String toString() {
		return "\nBoat Name: " + boatName + "\nBoat Type: " + boatType + "\nNumber of Staff: " + numOfStaff;
	}

}
