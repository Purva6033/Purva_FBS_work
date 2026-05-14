abstract class Payment{
	protected int paymentId;
	protected double amount;
	protected String payerName;
	protected String status;
	
	Payment(int paymentId,double amount,String payerName){
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName =payerName;
		this.status = "pending";
		
	}
	final void process() {
		if(validate()) {
			deductAmount();
			sendNotification();
			status="success";
		}
		else {
			status="failed";
			System.out.println("payment validation failed");
		}
	}
	
	void printSummary() {
		System.out.println("\nPayment ID:" + paymentId);
		System.out.println("Payer name:" + payerName);
		System.out.println("Amount:"+ amount);
		System.out.println("Status:"+ status);
	}
	abstract boolean validate();
	abstract void deductAmount();
	abstract void sendNotification();
	
}

 class CardPayment extends Payment{
	String cardNumber;
	String cvv;
	
	CardPayment(int paymentId,double amount,String payerName,String cardNumber,String cvv){
		super(paymentId,amount,payerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	boolean validate() {
		if(cardNumber.length() == 16 && cvv.length() == 3 && amount > 0) {
			return true;
		}
		return false;
	}
	void deductAmount() {
	    System.out.println("Amount deducted using card");
	}
	
	void sendNotification() {
		System.out.println("Card Payment Notification sent");
	}
}

class UpiPayment extends Payment{
	String upiId;
	
	UpiPayment(int paymentId,double amount,String payerName,String upiId){
		super(paymentId,amount,payerName);
		this.upiId = upiId;
		
	}
	boolean validate() {
		if(upiId.contains("@") && amount >= 1 && amount <= 100000 ) {
			return true;
		}
		return false;
				
	}
	
	void deductAmount() {
		System.out.println("amount deducted using upi");
	}
	void sendNotification() {
		System.out.println("upi payment notification sent");
	}
}
public class TestPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Payment p1 = new CardPayment(101,1000,"P","456123789987","568");
     Payment p2 = new CardPayment(102,5233,"Q","987654321123","985");
     Payment p3 = new UpiPayment(103,256892,"r","rupi");
     Payment p4 = new UpiPayment(104,212347,"s","supi");
     
     p1.process();
     p1.printSummary();
     
     p2.process();
     p2.printSummary();
     
     p3.process();
     p3.printSummary();
     
     p4.process();
     p4.printSummary();
	}

}
