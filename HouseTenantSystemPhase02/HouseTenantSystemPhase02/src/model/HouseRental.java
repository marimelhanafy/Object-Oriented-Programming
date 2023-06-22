package model;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author Wadha Albadr
 * @date 15/04/2020
 * @version JDK 13.0
 *
 */
public class HouseRental implements Serializable{

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
	private LocalDate rentalStartDate;
	
	/**
	 * The end date of rental
	 */
	private LocalDate rentalEndDate;
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
	public HouseRental(Tenant tenant, House house, LocalDate rentalStartDate, LocalDate rentalEndDate, double deposit,
			Invoice invoice) {
		this.tenant = tenant;
		this.house = house;
		this.rentalStartDate = rentalStartDate;
		this.rentalEndDate = rentalEndDate;
		this.deposit = deposit;
		this.invoice = invoice;
	}//end of constructor


	/**
	 * method to get tenant 
	 * @return tenant object
	 */
	public Tenant getTenant() {
		return tenant;
	}//end get method
	/**
	 * method to get house 
	 * @return house object
	 */
	public House getHouse() {
		return house;
	}//end get method
	/**
	 * method to get rental start date
	 * @return rentalStartDate
	 */
	public LocalDate getRentalStartDate() {
		return rentalStartDate;
	}//end get method
	/**
	 * method to get rental End Date 
	 * @return rentalEndDate
	 */
	public LocalDate getRentalEndDate() {
		return rentalEndDate;
	}//end get method
	/**
	 * method to get house rental deposit
	 * @return deposit
	 */
	public double getDeposit() {
		return deposit;
	}//end get method
	/**
	 * method to get house rental invoice
	 * @return invoice
	 */
	public Invoice getInvoice() {
		return invoice;
	}//end get method
	/**
	 * method to set tenant
	 * @param tenant
	 */
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}//end set method
	/**
	 * method to set house
	 * @param house
	 */
	public void setHouse(House house) {
		this.house = house;
	}//end set method
	/**
	 *  method to set rental start date 
	 * @param rentalStartDate
	 */
	public void setRentalStartDate(LocalDate rentalStartDate) {
		this.rentalStartDate = rentalStartDate;
	}//end set method
	/**
	 *  method to set rental end date 
	 * @param rentalEndDate
	 */
	public void setRentalEndDate(LocalDate rentalEndDate) {
		this.rentalEndDate = rentalEndDate;
	}//end set method
	/**
	 *  method to set house rental deposit 
	 * @param deposit
	 */
	public void setDeposit(double deposit) 
	{
		this.deposit = deposit;
	}//end set method
	/**
	 * method to set house rental invoice
	 * @param invoice
	 */
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}//end set method
	
	
	public int getInvoiceNo() {
		return invoice.getInvoiceNo();
	}
	
	public LocalDate getInvoiceDate() {
		return invoice.getInvoiceDate();
	}
	
	public double getTotal() {
		return invoice.calculateTotalPayment();
	}
	
	@Override
	public String toString() {
		return "HouseRentl: tenant= " + tenant + ",\nhouse= " + house + ",\nrentalStartDate= " + rentalStartDate
				+ ", rentalEndDate= " + rentalEndDate + ", deposit= " + deposit + ",\ninvoice= " + invoice;
	}
}
