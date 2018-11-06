/*
 * Author: Calin Doran
 * Date: 2018
 * Use: CA4
 */

package cA4;

public class PassangerBoat extends Boat {

	private int numOfPassangers;
	private boolean carryCars;

	public PassangerBoat(String boatName, String boatType, int numOfStaff, int numOfPassangers, boolean carryCars) {
		super(boatName, boatType, numOfStaff);
		this.numOfPassangers = numOfPassangers;
		this.carryCars = carryCars;
	}

	public int getNumOfPassangers() {
		return numOfPassangers;
	}

	public boolean isCarryCars() {
		return carryCars;
	}

	public void setCarryCars(boolean carryCars) {
		this.carryCars = carryCars;
	}

	public void setNumOfPassangers(int numOfPassangers) {
		this.numOfPassangers = numOfPassangers;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNumber of Passangers: " + numOfPassangers + "\nCar storage: " + carryCars;
	}

}
