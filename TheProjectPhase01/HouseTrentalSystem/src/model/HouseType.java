package model;

/**
 * @author Wadha Albadr
 * @date 07/03/2020
 * @version JDK 13.0
 *
 */
public class HouseType {

	/**
	 * The ID of the type
	 */
	private int typeId;
	
	/**
	 * The Description of the type
	 */
	private String description;
	
	/**
	 * The Price of the house type
	 */
	private double housePrice;

	
	/** constructor: initialize type ID, description, and price;
	 * @param typeId
	 * @param description
	 * @param housePrice
	 */
	public HouseType(int typeId, String description, double housePrice) {
		this.typeId = typeId;
		this.description = description;
		this.housePrice = housePrice;
	}

	/**
	 * @return type ID
	 */
	public int getTypeId() {
		return typeId;
	}

	/** method that set type ID
	 * @param typeId
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return description as a String
	 */
	public String getDescription() {
		return description;
	}

	/** method that set description of house type
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return house price as a double 
	 */
	public double getHousePrice() {
		return housePrice;
	}

	/** method that set price of house type
	 * @param housePrice
	 */
	public void setHousePrice(double housePrice) {
		this.housePrice = housePrice;
	}

	/**
	 * @return house type information 
	 */
	public String toString() {
		String s = String.format("House Type: ID: %d\nDescription: %s\nPrice: %.2f", typeId, description, housePrice);
		return s;
	}

}
