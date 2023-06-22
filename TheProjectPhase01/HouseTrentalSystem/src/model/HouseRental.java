package model;

/**
 * @author Wadha Albadr
 * @date 10/03/2020
 * @version JDK 13.0
 *
 */
public class HouseRental {

	/**
	 * The tenant of house
	 */
	private Tenant tenant;
	
	/**
	 * The house rented by tenant
	 */
	private House house;
	
	/**
	 * The start date of rental
	 */
	private Date rentalStartDate;
	
	/**
	 * The end date of rental
	 */
	private Date rentalEndDate;
	
	/**
	 * The deposit of the rental
	 */
	private double deposit;
	
	/**
	 * The invoice of house rental
	 */
	private Invoice invoice;
	
	
	/** constructor: initialize house rental information and set house availability to false.
	 * @param tenant
	 * @param house
	 * @param rentalStartDate
	 * @param rentalEndDate
	 * @param deposit
	 * @param invoice
	 */
	public HouseRental(Tenant tenant, House house, Date rentalStartDate, Date rentalEndDate, double deposit, Invoice invoice) {
		this.tenant = tenant;
		this.house = house;
		this.house.setAvailable(false);
		this.rentalStartDate = rentalStartDate;
		this.rentalEndDate = rentalEndDate;
		this.deposit = deposit;
		this.invoice = invoice;
	}

	/**
	 * @return the tenant if house rental
	 */
	public Tenant getTenant() {
		return tenant;
	}

	/** method to set the tenant in house rental
	 * @param tenant
	 */
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	/**
	 * @return the house that is inside house rental
	 */
	public House getHouse() {
		return house;
	}

	/** method to set house into house rental
	 * @param house
	 */
	public void setHouse(House house) {
		this.house = house;
	}

	/**
	 * @return start date of rental
	 */
	public Date getRentalStartDate() {
		return rentalStartDate;
	}

	/** method to set start date of rental
	 * @param rentalStartDate
	 */
	public void setRentalStartDate(Date rentalStartDate) {
		this.rentalStartDate = rentalStartDate;
	}

	/**
	 * @return end date of rental
	 */
	public Date getRentalEndDate() {
		return rentalEndDate;
	}

	/** method to set end date of rental
	 * @param rentalEndDate
	 */
	public void setRentalEndDate(Date rentalEndDate) {
		this.rentalEndDate = rentalEndDate;
	}

	/**
	 * @return deposit amount as a double
	 */
	public double getDeposit() {
		return deposit;
	}

	/** method to set deposit in house rental
	 * @param deposit
	 */
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	/**
	 * @return invoice of house rental
	 */
	public Invoice getInvoice() {
		return invoice;
	}

	/** method to set invoice of house rental
	 * @param invoice
	 */
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	/**
	 * @return house rental information as a String
	 */
	@Override
	public String toString() {
		String s = String.format("House Rental of %s\n%s\nRental Start Date: %s\nRental End Date: %s\nDeposit Amount: %f\n%s", tenant.toString(), house.toString(), rentalStartDate.toString(), rentalEndDate.toString(), deposit, invoice.toString());
		return s;
	}	 
	
}
