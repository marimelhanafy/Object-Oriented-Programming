/**
 * @author ...
 * @date ...
 *
 */
public class Resident extends Customer { 


	private int qatarId;

	public Resident(int customerId, String name, String phone, String address, String nationality,
			String drivingLicence, int qatarId) {
		super(customerId, name, phone, address, nationality, drivingLicence);
		this.qatarId = qatarId;
	}

	public int getQatarId() {
		return qatarId;
	}

	public void setQatarId(int qatarId) {
		this.qatarId = qatarId;
	}

	@Override
	public String toString() {
		return "Resident [qatarId=" + qatarId + "]";
	}

}
