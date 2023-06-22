import java.util.Date;

/**
 * @author ...
 * @date ...
 *
 */
public class Visitor extends Customer {

	private int passportNo;
	private Date entryDate, visaExpiryDate;
	public Visitor(int customerId, String name, String phone, String address, String nationality, String drivingLicence,
			int passportNo, Date entryDate, Date visaExpiryDate) {
		super(customerId, name, phone, address, nationality, drivingLicence);
		this.passportNo = passportNo;
		this.entryDate = entryDate;
		this.visaExpiryDate = visaExpiryDate;
	}
	public int getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Date getVisaExpiryDate() {
		return visaExpiryDate;
	}
	public void setVisaExpiryDate(Date visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}
	@Override
	public String toString() {
		return "Visitor [passportNo=" + passportNo + ", entryDate=" + entryDate + ", visaExpiryDate=" + visaExpiryDate
				+ "]";
	}
}
