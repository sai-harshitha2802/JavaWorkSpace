public class PaymentApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment pay =new UPI();
		// Payment pay =new Card();
		
		pay.doPayment();
		pay.ProcessingFee();


	}


}
