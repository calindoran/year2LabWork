/*
 * Author: Calin Doran
 * Date: 2018
 * Use: CA4
 */

package cA4;

public class Fleet {

	private String fleetName;
	private int fleetIdNum;
	private PassangerBoat[] passangerBoat;
	private FreightBoat[] freightBoat;

	public Fleet(String fleetName, int fleetIdNum, PassangerBoat[] passangerBoat, FreightBoat[] freightBoat) {
		this.fleetName = fleetName;
		this.fleetIdNum = fleetIdNum;
		this.freightBoat = freightBoat;
		this.passangerBoat = passangerBoat;
	}

	public int getFleetIdNum() {
		return fleetIdNum;
	}

	public String getFleetName() {
		return fleetName;
	}

	public FreightBoat[] getFreightBoat() {
		return freightBoat;
	}

	public PassangerBoat[] getPassangerBoat() {
		return passangerBoat;
	}

	public void setFleetIdNum(int fleetIdNum) {
		this.fleetIdNum = fleetIdNum;
	}

	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
	}

	public void setFreightBoat(FreightBoat[] freightBoat) {
		this.freightBoat = freightBoat;
	}

	public void setPassangerBoat(PassangerBoat[] passangerBoat) {
		this.passangerBoat = passangerBoat;
	}

	@Override
	public String toString() {
		/*
		 * for(PassangerBoat x: passangerBoat) { System.out.println(x); }
		 * 
		 * for(FreightBoat y: freightBoat) { System.out.println(y); }
		 */

		return "\nFleet name: " + fleetName + "\nFleet ID: " + fleetIdNum + "\nNumber of Passanger Boats: "
				+ passangerBoat + "\nNumber of Freight Boats: " + freightBoat;
	}

}
