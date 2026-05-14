 class LibraryUser {

	 static double finePerDay = 5.0;
	 
	 String userName;
	 double daysLate;
	 
	 LibraryUser(String name,double days){
		 userName = name;
		 daysLate = days;
	 }
	 
	 double calculateFine() {
		 return daysLate * finePerDay;
	 }
	 
	 void display() {
		    System.out.println("User Name : " + userName);
	        System.out.println("Days Late : " + daysLate);
	        System.out.println("Fine Per Day : " + finePerDay);
	        System.out.println("Total Fine : " + calculateFine());
	        System.out.println();
	 }
	 
	 public static void main(String[] args) {
		LibraryUser u1 = new LibraryUser("P",10);
		LibraryUser u2 = new LibraryUser("Q",2);
		
		u1.display();
		u2.display();
	}
}
