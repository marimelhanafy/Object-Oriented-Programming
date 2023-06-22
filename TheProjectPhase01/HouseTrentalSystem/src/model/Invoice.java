package model;

import java.util.ArrayList;

/**
 * @author Mariam Abdelsalam
 * @date 13/03/2020
 * @version JDK 13.0
 *
 */
public class Invoice {

	/**
	 * The invoice number
	 */
	private int invoiceNo;
	
	/**
	 * The invoice date
	 */
	private Date invoiceDate;
	
	/**
	 * The list of payments
	 */
	private ArrayList <Payment> payments = new ArrayList <Payment>();
	
	
	/** constructor: initialize invoice number, date, and payment list
	 * @param invoiceNo
	 * @param invoiceDate
	 * @param payments
	 */
	public Invoice(int invoiceNo, Date invoiceDate, ArrayList<Payment> payments) {
		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.payments = payments;
	}

	
	/**
	 * @return invoice number
	 */
	public int getInvoiceNo() {
		return invoiceNo;
	}

	/** method to set invoice number
	 * @param invoiceNo
	 */
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 * @return invoice date
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/** method to set invoice date
	 * @param invoiceDate
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return array list of payments
	 */
	public ArrayList<Payment> getPayments() {
		return payments;
	}

	/** method to set an array list of payments
	 * @param payments
	 */
	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}
	
	
	/** method to update payment information
	 * @param payment
	 */
	public void modifylPayment (Payment payment) {
		for (Payment p : payments) {
			if (payment.getPaymentId()==p.getPaymentId()) {
				p.setDescription(payment.getDescription());
				p.setPaymentDate(payment.getPaymentDate());
				p.setPaymentId(payment.getPaymentId());
				p.setPaymentType(payment.getPaymentType());
				p.setPrice(payment.getPrice());
			}
		}
	}
		
	
	/** method to Delete a payment
	 * @param paymentId
	 * @return String to confirm if the payment deleted or not
	 */
	public String deletePayment (int paymentId) {
		String output = "Payment ID Not Found";
		for (Payment p: payments) {
			if (paymentId==p.getPaymentId()) {
				payments.remove(p);
				output = String.format("The Payment of id: %d is deleted successfully", paymentId);
			}
		}
		return output;
	}
	
	/** method to Add a new payment to the system
	 * @param payment
	 */
	public void addPayment (Payment payment) {
		payments.add(payment);
	}
	
	/** method to Search for a specific payments by their Id
	 * @param paymentId
	 * @return payment of a specific Id
	 */
	public Payment getPayment (int paymentId) {
		Payment payment = null;
		for (int i=0; i<payments.size();i++) {
			if (paymentId==payments.get(i).getPaymentId())
				payment=payments.get(i);
		}
		return payment;
	}
	
	/** method to Calculate total payment for the invoice
	 * @return total payment as a double
	 */
	public double calculateTotalPayment() {
		double total = 0.0;
		for (int i=0; i<payments.size();i++) {
			total+= payments.get(i).getPrice();
		}
		return total;
	}

	/**
	 * @return Invoice information
	 */
	@Override
	public String toString() {
		String s = String.format("Invoice number: %s\nDate: %s\nInvoice Payments:\n%s\nTotal Price of Payments: %.2f", invoiceNo, invoiceDate.toString(), payments.toString(), calculateTotalPayment());
		return s;
	}
	
	
}
