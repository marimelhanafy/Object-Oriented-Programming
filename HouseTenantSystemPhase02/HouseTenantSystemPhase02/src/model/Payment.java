package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author Mariam Abdelsalam
 * @date 15/04/2020
 * @version JDK 13.0
 *
 */
public class Payment implements Serializable{
	
	private String paymentType;
	private int paymentId;
	private String description;
	private double price;
	private LocalDate paymentDate;
	
	
	
	/**
	 * @param paymentType
	 * @param paymentId
	 * @param description
	 * @param price
	 * @param paymentDate
	 */
	public Payment(String paymentType, int paymentId, String description, double price, LocalDate paymentDate) {
		this.paymentType = paymentType;
		this.paymentId = paymentId;
		this.description = description;
		this.price = price;
		this.paymentDate = paymentDate;
	}
	
	
	/**`
	 * method to get paymentType
	 * @return payment tepe
	 */
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * method to get payment Id
	 * @return payment id
	 */
	public int getPaymentId() {
		return paymentId;
	}
	/**
	 * method to get payment Description
	 * @return Description 
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * method to get payment price 
	 * @return price 
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * method to get payment Date 
	 * @return paymentDate
	 */
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	/**
	 * method to set Payment type 
	 * @param paymentType
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * method to set PaymentId
	 * @param paymentId
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	/**
	 * method to set Payment description
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * method to set price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * method to set Payment Date
	 * @param paymentDate
	 */
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}


	@Override
	public String toString() {
		return "Payment: "+" paymentType= " + paymentType + ", paymentId= " + paymentId + ", description= " + description
				+ ", price= " + price + ", paymentDate= " + paymentDate;
	}//end of toString method
	

}//end of class