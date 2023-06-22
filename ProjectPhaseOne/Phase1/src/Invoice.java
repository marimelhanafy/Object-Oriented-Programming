import java.util.ArrayList;
import java.util.Date;

/**
 * @author ...
 * @date ...
 *
 */
public class Invoice {

	private int invoiceNo;
	private Date invoiceDate;
	private ArrayList<Payment> payments = new ArrayList<Payment>();
	public Invoice(int invoiceNo, Date invoiceDate, ArrayList<Payment> payments) {
		super();
		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.payments = payments;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public ArrayList<Payment> getPayments() {
		return payments;
	}
	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}

	/**method to modify payment by the payment id
	 * @param payment
	 * @return confirmation message 
	 */
	public String modifyPayment (Payment payment) {
		for (Payment p : payments) {
			if (payment.getPaymentId()==p.getPaymentId()) {
				p.setPaymentDescription(payment.getPaymentDescription());
				p.setPaymentDate(payment.getPaymentDate());
				p.setPrice(payment.getPrice());
				return "updated payment successfully";
			}
		}
		return null;
	}


	/**method to delete payment by payment id
	 * @param paymentId
	 * @return confirmation message
	 */
	public String deletePayment (int paymentId) {
		String output = "Payment ID Not Found";
		for (Payment p: payments) {
			if (paymentId==p.getPaymentId()) {
				payments.remove(p);
				output ="delete payment successfully";
			}
		}
		return output;
	}

	/**method to add payment
	 * @param payment
	 * @return confirmation message
	 */
	public String addPayment (Payment payment) {
		payments.add(payment);
		return "add payment successfully";
	}


	/**method to get payment by payment id
	 * @param paymentId
	 * @return payment
	 */
	public Payment getPayment (int paymentId) {
		Payment payment = null;
		for (int i=0; i<payments.size();i++) {
			if (paymentId==payments.get(i).getPaymentId())
				payment=payments.get(i);
		}
		return payment;
	}

	/**method to calculate the total price for all payments 
	 * @return total price
	 */
	public double calculateTotalPayment() {
		double total = 0.0;
		for (int i=0; i<payments.size();i++) {
			total+= payments.get(i).getPrice();
		}
		return total;
	}




	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate + ", payments=" + payments + "]";
	}	
}
