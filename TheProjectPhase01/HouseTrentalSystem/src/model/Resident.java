package model;

/**
 * @author Hagar Elsayed
 * @date 08/03/2020
 * @version JDK 13.0
 *
 */
public class Resident extends Tenant {

	/**
	 * The Qatar Id of resident
	 */
	private int qatarId;
	
	/**
	 * The Bank name of resident
	 */
	private String bankName;
	
	/**
	 * The Bank account number of resident
	 */
	private String bankAccountNo;
	
	
	/** constructor: initialize resident's informations
	 * @param tenantId
	 * @param name
	 * @param phone
	 * @param address
	 * @param nationality
	 * @param qatarId
	 * @param bankName
	 * @param bankAccountNo
	 */
	public Resident(int tenantId, String name, String phone, String address, String nationality, int qatarId,
			String bankName, String bankAccountNo) {
		super(tenantId, name, phone, address, nationality);
		this.qatarId = qatarId;
		this.bankName = bankName;
		this.bankAccountNo = bankAccountNo;
	}

	
	/**
	 * @return the Qatar Id of resident
	 */
	public int getQatarId() {
		return qatarId;
	}

	/** method to set the Qatar Id of resident
	 * @param qatarId
	 */
	public void setQatarId(int qatarId) {
		this.qatarId = qatarId;
	}

	/**
	 * @return The Bank name of resident
	 */
	public String getBankName() {
		return bankName;
	}

	/** method to set the Bank name of resident
	 * @param bankName
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return The Bank account number of resident
	 */
	public String getBankAccountNo() {
		return bankAccountNo;
	}

	/** method to set the Bank account number of resident
	 * @param bankAccountNo
	 */
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	/**
	 * @return the resident's information as a String
	 */
	@Override
	public String toString() {
		String s = String.format("Tenant is: Resident\nQatar ID: %d\nBank name: %s\nBank Account number: %s",qatarId, bankName, bankAccountNo);
		return super.toString()+s;
	}
}
