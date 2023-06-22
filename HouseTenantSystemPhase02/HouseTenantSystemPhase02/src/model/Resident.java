package model;

import java.io.Serializable;

/**
 * @author Hagar Elsayed
 * @date 15/04/2020
 * @version JDK 13.0
 *
 */
public class Resident extends Tenant implements Serializable {
	
	
	private int qatarId;
	private String bankName;
	private String bankAccountNo;
	
	
	/**
	 * @param tenantId
	 * @param name
	 * @param phone
	 * @param address
	 * @param nationaliy
	 * @param qatarId
	 * @param bankName
	 * @param bankAccountNo
	 */
	public Resident(int tenantId, String name, String phone, String address, String nationaliy
			,int qatarId,String bankName,String bankAccountNo) {
		super(tenantId, name, phone, address, nationaliy);
		this.qatarId=qatarId;
		this.bankName=bankName;
		this.bankAccountNo=bankAccountNo;
	}
	
	/**
	 * method to get qatarId 
	 * @return qatarId
	 */
	public int getQatarId() {
		return qatarId;
	}
	/**
	 * method to get bank Name
	 * @return bank name
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * method to get bank account 
	 * @return bank account
	 */
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	/**
	 * method to set qatar id
	 * @param qatarId
	 */
	public void setQatarId(int qatarId) {
		this.qatarId = qatarId;
	}
	/**
	 * method to set bank name
	 * @param bankName
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * method to set bank account 
	 * @param bankAccountNo
	 */
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	@Override
	public String toString() {
		return "Resident: "+super.toString()+"\nqatarId= " + qatarId + ", bankName= " + bankName + ", bankAccountNo = " + bankAccountNo;
	}//end of toString method
	
	
}//end of class
