/**
 * @author ...
 * @date ...
 *
 */
public class Customer {

	private int customerId;
	private String name, phone, address, nationality,drivingLicence;
	public Customer(int customerId, String name, String phone, String address, String nationality,
			String drivingLicence) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.nationality = nationality;
		this.drivingLicence = drivingLicence;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", nationality=" + nationality + ", drivingLicence=" + drivingLicence + "]";
	}



}
