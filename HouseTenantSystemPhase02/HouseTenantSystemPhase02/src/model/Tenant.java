package model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Hagar Elsayed
 * @date 15/04/2020
 * @version JDK 13.0
 *
 */
public class Tenant implements Serializable{
	
	private int tenantId;
	private String name;
	private String phone;
	private String address;
	private String nationaliy;
	
	
	
	
	/**
	 * @param tenantId
	 * @param name
	 * @param phone
	 * @param address
	 * @param nationaliy
	 */
	public Tenant(int tenantId, String name, String phone, String address, String nationaliy) {
		super();
		this.tenantId = tenantId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.nationaliy = nationaliy;
	}
	
	
	
	
	
	
	/**
	 *method to get tenant 
	 * @return tenantId
	 */
	public int getTenantId() {
		return tenantId;
	}

	/**
	 * method to get name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * method to get phone 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * method to get address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * method to get nationality 
	 * @return nationality
	 */
	public String getNationaliy() {
		return nationaliy;
	}
	/**
	 * method to set tenant
	 * @param tenantId
	 */
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	
	/**
	 * method to set name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * method to set phone
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * method to set address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * method to set 
	 * @param nationaliy
	 */
	public void setNationaliy(String nationaliy) {
		this.nationaliy = nationaliy;
	}
	
	
	

	
	
	
	


	@Override
	public String toString() {
		return "tenantId= " + tenantId + ", name= " + name + ", phone= " + phone + ", address= " + address
				+ ", nationaliy= " + nationaliy;
	}//end of toStrong method






	
	

}//end of class