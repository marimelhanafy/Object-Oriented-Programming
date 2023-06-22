package model;

/**
 * @author Wadha Albadr
 * @date 08/03/2020
 * @version JDK 13.0
 *
 */
public class House {

	/**
	 * The number of house
	 */
	private int houseNo;
	
	/**
	 * The address of house
	 */
	private String address;
	
	/**
	 * variable to indicate the availability of the house
	 */
	private boolean isAvailable;
	
	/**
	 * The type of house
	 */
	private HouseType type;
	
	/** constructor: initialize the house informations
	 * @param houseNo
	 * @param address
	 * @param isAvailable
	 * @param type
	 */
	public House(int houseNo, String address, boolean isAvailable, HouseType type) {
		this.houseNo = houseNo;
		this.address = address;
		this.isAvailable = isAvailable;
		this.type = type;
	}

	/**
	 * @return house number as an integer
	 */
	public int getHouseNo() {
		return houseNo;
	}

	/** method to set the house number
	 * @param houseNo
	 */
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * @return the address as a String
	 */
	public String getAddress() {
		return address;
	}

	/** method to set the address of the house
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/** 
	 * @return true if the house is available and false if not
	 */
	public boolean isAvailable() {
		return isAvailable;
	}

	/** method to set the availability of house
	 * @param isAvailable
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	/**
	 * @return the type of house as a HouseType variable
	 */
	public HouseType getType() {
		return type;
	}

	/** method to set type of house 
	 * @param type
	 */
	public void setType(HouseType type) {
		this.type = type;
	}

	/**
	 * @return house information
	 */
	@Override
	public String toString() {
		String s = String.format("\nHouse number (%d):\nAdress: %s\nCurrent state (Available or not): %b\n%s", houseNo, address, isAvailable, type);
		return s;
	}
	 
}
