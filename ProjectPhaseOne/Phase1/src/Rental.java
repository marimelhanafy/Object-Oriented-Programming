import java.time.LocalDate;

/**
 * @author ...
 * @date ...
 *
 */
public class Rental {

	private int rentalNo;
	private Customer customer;
	private Car car;
	private LocalDate StartDate;
	private LocalDate EndDate;
	private double deposit;
	private Invoice invoice;
	public Rental(int rentalNo, Customer customer, Car car, LocalDate startDate, LocalDate endDate, double deposit,
			Invoice invoice) {
		super();
		this.rentalNo = rentalNo;
		this.customer = customer;
		this.car = car;
		StartDate = startDate;
		EndDate = endDate;
		this.deposit = deposit;
		this.invoice = invoice;
	}
	public int getRentalNo() {
		return rentalNo;
	}
	public void setRentalNo(int rentalNo) {
		this.rentalNo = rentalNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public LocalDate getStartDate() {
		return StartDate;
	}
	public void setStartDate(LocalDate startDate) {
		StartDate = startDate;
	}
	public LocalDate getEndDate() {
		return EndDate;
	}
	public void setEndDate(LocalDate endDate) {
		EndDate = endDate;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "Rental [rentalNo=" + rentalNo + ", customer=" + customer + ", car=" + car + ", StartDate=" + StartDate
				+ ", EndDate=" + EndDate + ", deposit=" + deposit + ", invoice=" + invoice + "]";
	}

}
