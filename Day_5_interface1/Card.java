public class Card implements Payment {


	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		
		System.out.println("Doing payment by card");


	}


	@Override
	public void ProcessingFee() {
		// TODO Auto-generated method stub
		System.out.println("9%tax");


	}


}
