/*
 * Author: Calin Doran
 * Date: 2018
 * Use: CA4
 */

package cA4;

public class FreightBoat extends Boat {

	private String containerCap;

	public FreightBoat(String boatName, String boatType, int numOfStaff, String containerCap) {
		super(boatName, boatType, numOfStaff);
		this.containerCap = containerCap;
	}

	public String getContainerCap() {
		return containerCap;
	}

	public void setContainerCap(String containerCap) {
		this.containerCap = containerCap;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCantainer Cap: " + containerCap;
	}

}
