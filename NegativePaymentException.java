
public class NegativePaymentException extends Exception {
	
	
	double payment;
	
	// constructor
	public NegativePaymentException(double payment) {
		//System.out.println("ERROR: negative payment");
		this.payment = payment;
	}
	
	// override the toString method
	public String toString() {
		return "Error: Cannot take a negative payment " + payment;
	}
}