package model;

/**
 * @author Hagar Elsayed
 * @date 08/03/2020
 * @version JDK 13.0
 *
 */
public class Visitor extends Tenant {

	/**
	 * The passport number
	 */
	private int passportNo;
	
	/**
	 * The visitor entry date 
	 */
	private Date entryDate;
	
	/**
	 * The visitor's visa expire date
	 */
	private Date visaExpiryDate;
	
	
	/** constructor: initialize visitor informations
	 * @param tenantId
	 * @param name
	 * @param phone
	 * @param address
	 * @param nationality
	 * @param passportNo
	 * @param entryDate
	 * @param visaExpiryDate
	 */
	public Visitor(int tenantId, String name, String phone, String address, String nationality, int passportNo,
			Date entryDate, Date visaExpiryDate) {
		super(tenantId, name, phone, address, nationality);
		this.passportNo = passportNo;
		this.entryDate = entryDate;
		this.visaExpiryDate = visaExpiryDate;
	}

	
	/**
	 * @return the passport number
	 */
	public int getPassportNo() {
		return passportNo;
	}

	/** method to set the passport number
	 * @param passportNo
	 */
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	/**
	 * @return the entry date 
	 */
	public Date getEntryDate() {
		return entryDate;
	}

	/** method to set the entry date 
	 * @param entryDate
	 */
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * @return the visa expire date
	 */
	public Date getVisaExpiryDate() {
		return visaExpiryDate;
	}

	/** method to set the visa expire date
	 * @param visaExpiryDate
	 */
	public void setVisaExpiryDate(Date visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}

	/**
	 * @return the visitor informations
	 */
	@Override
	public String toString() {
		String s = String.format("Tenant is: Visitor\nPassport number: %d\nentryDate: %s\nvisaExpiryDate: %s", passportNo, entryDate, visaExpiryDate);
		return super.toString()+s;
	}
	
}
