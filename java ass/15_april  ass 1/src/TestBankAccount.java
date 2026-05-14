
public class TestBankAccount {
	
		 int accountNumber;
		 String holderName;
		 double currentBalance;
		 double interestRate;

		TestBankAccount(){
		accountNumber = 123456;
		holderName = "Puru";
		currentBalance = 100000;
		interestRate = 5.5;
		}

		TestBankAccount(int accountNumber, String holderName, double currentBalance, double interestRate){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.currentBalance=currentBalance;
		this.interestRate=interestRate;
		}

		int getAccountNumber() {return accountNumber; }
		void setAccountNumber(int accountNumber) {this.accountNumber=accountNumber; }

		String getHolderName() {return holderName; }
		void setHolderName(String holderName) {this.holderName=holderName; }

		double getCurrentBalance() {return currentBalance; }
		void setCurrentBalance(double currentBalance) {this.currentBalance=currentBalance;}

		double getInterestRate() {return interestRate; }
		void setInterestRate(double interestRate) {this.interestRate=interestRate; }

		void display(){
		System.out.println(accountNumber + " " + holderName + " " + currentBalance + " " + interestRate);
		}

	
		public static void main(String [] args){
			TestBankAccount b = new TestBankAccount(123456,"Puru",100000,5.5);
		b.display();
		System.out.println(b.hashCode());
		}}

