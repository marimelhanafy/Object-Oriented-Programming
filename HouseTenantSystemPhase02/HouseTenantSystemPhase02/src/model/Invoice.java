package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Mariam Abdelsalam
 * @date 15/04/2020
 * @version JDK 13.0
 *
 */
public class Invoice implements Serializable {

	private int invoiceNo;
	private LocalDate invoiceDate;
	private ArrayList<Payment> payments;

	private static int auto; 
	/**
	 * constructor 
	 * @param invoiceNo
	 * @param invoiceDate
	 * @param payments
	 */
	public Invoice( LocalDate invoiceDate,ArrayList<Payment> payments) { 
		auto ++;
		this.invoiceNo = auto;
		this.invoiceDate = invoiceDate;
		this.payments =payments;
	}//end of constructor 

	/**
	 * method to get invoice
	 * @return
	 */
	public int getInvoiceNo() {
		return invoiceNo;
	}//end get method
	/**
	 * method to get Date
	 * @return
	 */
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}//end get method
	/**
	 * method to get payment
	 * @return
	 */
	public ArrayList<Payment> getPayments() {
		return payments;
	}//end get method
	/**
	 * method to set invoice 
	 * @param invoiceNo
	 */
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}//end set method
	/**
	 * method to set invoice date
	 * @param invoiceDate
	 */
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}//end set method
	/**
	 * method to set payment
	 * @param payments
	 */
	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}//end set method


	//methods:

	/**
	 * Update payment information 
	 * @param payment
	 */
	public void modifyIPayment(Payment payment) {
		for(int i=0;i<payments.size();i++) {
			if(payment.getPaymentId()==payments.get(i).getPaymentId()) {
				payments.get(i).setPaymentType(payment.getPaymentType());
				payments.get(i).setPaymentId(payment.getPaymentId());
				payments.get(i).setDescription(payment.getDescription());
				payments.get(i).setPrice(payment.getPrice());
				payments.get(i).setPaymentDate(payment.getPaymentDate());		
			}
		}
		System.out.println("modifayed successfully!!!!");

	}//end of modifyIPayment method
	/**
	 * delete a payment 
	 * @param paymentId
	 * @return String 
	 */
	public String deletePayement(int paymentId) {
		for(int i=0;i<payments.size();i++) {
			if(payments.get(i).getPaymentId()==paymentId) {
				payments.remove(i);
				return "payment is removed successfully!!! ";
			}
		}
		return "payment is not found!!!";
	}//end of deletePayement method
	/**
	 * add a new payment to the system 
	 * @param payment
	 */
	public void addPayment(Payment payment) {
		payments.add(payment);
	}//end of addPayment method
	/**
	 * search for a specific tenant by their id
	 * @param paymentId
	 * @return payment object
	 */
	public Payment getPayment(int paymentId ) {
		for(int i=0;i<payments.size();i++) {
			if(payments.get(i).getPaymentId()==paymentId)
				return payments.get(i);
		}
		return null;
	}//end of getPayment method
	/**
	 * calculate total payment for the invoice
	 * @return double
	 */
	public double calculateTotalPayment() {
		double sum=0;
		for(int i=0;i<payments.size();i++) {
			sum+=payments.get(i).getPrice();
		}
		return sum;
	}//end of calculateTotalPayment method

	@Override
	public String toString() {
		String s1="Invoice: invoiceNo= " + invoiceNo+ ", invoiceDate= " + invoiceDate+"\n";
		for(int i=0;i<payments.size();i++) {
			s1+="Payment type: "+payments.get(i).getPaymentType()+" payment Id: "+payments.get(i).getPaymentId()+
					" payment description: "+payments.get(i).getDescription()+" payment price: "+payments.get(i).getPrice()+
					" payment Date: "+payments.get(i).getPaymentDate()+"\n\n";
		}
		return s1;
	}//end toString method
}//end of class
