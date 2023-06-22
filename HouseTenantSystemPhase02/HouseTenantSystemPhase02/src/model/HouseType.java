package model;

import java.io.Serializable;

/**
 * @author Wadha Albadr
 * @date 15/04/2020
 * @version JDK 13.0
 *
 */
public class HouseType implements Serializable{
	private int typeId;
	private String description;
	private double housePrice;

	/**
	 * @param typeId
	 * @param description
	 * @param housePrice
	 */

	public HouseType(int typeId, String description, double housePrice) {
		this.typeId = typeId;
		this.description = description;
		this.housePrice = housePrice;
	}//end of constructor

	public HouseType() {
		super();
	}

	/**
	 * method to get house type id
	 * @return typeId
	 */
	public int getTypeId() {
		return typeId;
	}//end get method
	/**
	 * method to get house type description 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}//end get method
	/**
	 *  method to get house type price
	 * @return price
	 */
	public double getHousePrice() {
		return housePrice;
	}//end get method
	/**
	 *  method to set house type id
	 * @param typeId
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}//end set method
	/**
	 * method to set house type description 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}//end set method
	/**
	 * method to set house type price
	 * @param housePrice
	 */
	public void setHousePrice(double housePrice) {
		this.housePrice = housePrice;
	}//end set method
	@Override
	public String toString() {
		return "HouseType typeId= " + typeId + ", description= " + description + ", housePrice= " + housePrice;
	}//end toString method
}//end of the class
