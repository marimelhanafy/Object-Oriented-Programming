package model;

/**
 * @author Mariam Abdelsalam
 * @date 07/03/2020
 * @version JDK 13.0
 *
 */
public class Payment {

	/**
	 * The type of payment 
	 */
	private String paymentType;
	
	/**
	 * The Id of payment
	 */
	private int paymentId;
	
	/**
	 * The description of payment
	 */
	private String description;
	
	/**
	 * The price of payment
	 */
	private double price;
	
	/**
	 * The date of payment
	 */
	private Date paymentDate;

	
	/** constructor: initialize the payment information
	 * @param paymentType
	 * @param paymentId
	 * @param description
	 * @param price
	 * @param paymentDate
	 */
	public Payment(String paymentType, int paymentId, String description, double price, Date paymentDate) {
		this.paymentType = paymentType;
		this.paymentId = paymentId;
		this.description = description;
		this.price = price;
		this.paymentDate = paymentDate;
	}

	
	/**
	 * @return payment type
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/** method to set the payment type
	 * @param paymentType
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the payment Id
	 */
	public int getPaymentId() {
		return paymentId;
	}

	/** method to set the payment Id
	 * @param paymentId
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return description of the payment
	 */
	public String getDescription() {
		return description;
	}

	/** method to set description of the payment
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return price of payment
	 */
	public double getPrice() {
		return price;
	}

	/** method to set price of payment
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return payment date
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/** method to set payment date
	 * @param paymentDate
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	/**
	 * @return payment informations
	 */
	public String toString() {
		String s = String.format("\nPayment ID (%d):\nType: %s\nDescription: %s\nPrice: %.2f\nDate: %s\n", paymentId, paymentType, description, price, paymentDate);
		return s;
	}

}
