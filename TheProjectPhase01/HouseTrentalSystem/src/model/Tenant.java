package model;

/**
 * @author Hagar Elsayed
 * @date 07/03/2020
 * @version JDK 13.0
 *
 */
public class Tenant {

	/**
	 * The tenant Id number
	 */
	private int tenantId;
	
	/**
	 * The tenant name 
	 */
	private String name;
	
	/**
	 * The tenant phone number 
	 */
	private String phone;
	
	/**
	 * The tenant address
	 */
	private String address;
	
	/**
	 * The tenant nationality
	 */
	private String nationality;
	
	
	/** constructor: initialize tenant's informations
	 * @param tenantId
	 * @param name
	 * @param phone
	 * @param address
	 * @param nationality
	 */
	public Tenant(int tenantId, String name, String phone, String address, String nationality) {
		this.tenantId = tenantId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.nationality = nationality;
	}
	

	/**
	 * @return The tenant Id number
	 */
	public int getTenantId() {
		return tenantId;
	}

	/** method to set the tenant Id number
	 * @param tenantId
	 */
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * @return The tenant name
	 */
	public String getName() {
		return name;
	}

	/** method to set the tenant name 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The tenant phone number 
	 */
	public String getPhone() {
		return phone;
	}

	/** method to set the tenant phone number 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return The tenant address
	 */
	public String getAddress() {
		return address;
	}

	/** method to set the tenant address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return The tenant nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/** method to set the tenant nationality
	 * @param nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	/**
	 * @return the tenant's information
	 */
	public String toString() {
		String s = String.format("Tenant ID (%d):\nName: %s\nPhone: %s\nAdress: %s\nNationality: %s", tenantId,  name, phone, address, nationality);
		return s+"\n";
	}
	 
}
