package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author Hagar Elsayed
 * @date 15/04/2020
 * @version JDK 13.0
 *
 */
public class Visitor extends Tenant implements Serializable {
	private int passportNo;
	private LocalDate entryDate;
	private LocalDate visaExpiryDate;



	/**
	 * @param tenantId
	 * @param name
	 * @param phone
	 * @param address
	 * @param nationaliy
	 * @param passportNo
	 * @param entryDate
	 * @param visaExpiryDate
	 */
	public Visitor(int tenantId, String name, String phone, String address, String nationaliy, int passportNo,
			LocalDate entryDate, LocalDate visaExpiryDate) {
		super(tenantId, name, phone, address, nationaliy);
		this.passportNo = passportNo;
		this.entryDate = entryDate;
		this.visaExpiryDate = visaExpiryDate;
	}
	


	/**
	 * method to get passport number 
	 * @return passport number 
	 */
	public int getPassportNo() {
		return passportNo;
	}
	/**
	 * method to get entry date 
	 * @return entry date 
	 */
	public LocalDate getEntryDate() {
		return entryDate;
	}
	/**
	 * method to get visaExpiryDate
	 * @return visaExpiryDate
	 */
	public LocalDate getVisaExpiryDate() {
		return visaExpiryDate;
	}
	/**
	 * method to set passport number 
	 * @param passportNo
	 */
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	/** 
	 * method to set entry date
	 * @param entryDate
	 */
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	/**
	 * method to set visaExpiryDate
	 * @param visaExpiryDate
	 */
	public void setVisaExpiryDate(LocalDate visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}
	
	
	
	@Override
	public String toString() {
		return"Visitor: "+super.toString()+"\npassportNo= " + passportNo + ", entryDate= " + entryDate + ", visaExpiryDate= " + visaExpiryDate;
	}//end of toString method


}//end of class
