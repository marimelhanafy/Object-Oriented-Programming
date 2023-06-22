package model;

import java.io.Serializable;

/**
 * @author Wadha Albadr
 * @date 08/03/2020
 * @version JDK 13.0
 *
 */
public class House implements Serializable
{
	private int houseNo;
	private String address;
	private boolean isAvailabile;
	private HouseType type;

	/**
	 * @param houseNo
	 * @param address
	 * @param isAvailabile
	 * @param type
	 */
	
	
	public House(int houseNo, String address, boolean isAvailabile, HouseType type) 
	{
		super();
		this.houseNo = houseNo;
		this.address = address;
		this.isAvailabile = isAvailabile;
		this.type = type;
	}//end of constructor 
	
	public House() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * method to get houseNo
	 * @return houseNo
	 */
	public int getHouseNo() {
		return houseNo;
	}//end get method
	/**
	 * method to get house address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}//end get method
	/**
	 * method to get if the house is available
	 * @return boolean 
	 */
	public boolean isAvailabile() {
		return isAvailabile;
	}//end get method
	/**
	 * method to get house Type
	 * @return type of house
	 */
	public HouseType getType() {
		return type;
	}//end get method

	/**
	 * method to set houseNo 
	 * @param houseNo
	 */
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}//end set method
	/**
	 * method to set address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}//end set method
	/**
	 * method to set the availability of a house 
	 * @param isAvailabile
	 */
	public void setAvailabile(boolean isAvailabile) {
		this.isAvailabile = isAvailabile;
	}//end set method
	
	public double getPrice() {
		return this.type.getHousePrice();
	}
	
	public String getDescription() {
		return this.type.getDescription();
	}
	
	/**
	 * method to set the hose type 
	 * @param type
	 */
	public void setType(HouseType type) {
		this.type = type;
	}//end set method
	@Override
	public String toString() {
		return "House houseNo= " + houseNo + ", address= " + address + ", isAvailabile= " + isAvailabile + ", type= "
				+ type;
	}//end toString method
}//end of the class
