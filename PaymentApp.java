import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		//variables
		double payment = 0;
		boolean positivePymt = true;
		
		do {
			//1. Ask the user the amount
			System.out.print("Enter the payment amount: ");
			
			//2. get the amount and test the value
			Scanner in = new Scanner(System.in); // read an input
			
			// 3. Handle exceptions
			
			 try {
				 payment = in.nextDouble();
				 if (payment < 0) {
					 throw new NegativePaymentException(payment);
				 }
				 else {
					 //positivePymt = true;
					 break;
					 
				 }
			 } catch (NegativePaymentException e) {
				 System.out.println(e.toString()); 
				 positivePymt = false;
			 }
		 
		} while (!positivePymt);
		
		// 4. print confirmation
		
		System.out.println("Thank you for your payment of $" + payment);
		
		
		

		
	}

}

