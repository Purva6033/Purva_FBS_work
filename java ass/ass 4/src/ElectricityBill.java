
public class ElectricityBill {

	static double ratePerUnit = 6.0;
	
	int customerId;
	String customerName;
	int unitsConsumed;
	
	ElectricityBill(int id, String name, int units) {
        customerId = id;
        customerName = name;
        unitsConsumed = units;
    }
	
	static void updateRate(double newRate) {
		ratePerUnit = newRate;
	}
	
	double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }
	
	void display() {
		    System.out.println("Customer ID : " + customerId);
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Units Consumed : " + unitsConsumed);
	        System.out.println("Rate Per Unit : " + ratePerUnit);
	        System.out.println("Bill Amount : " + calculateBill());
	        System.out.println();
	}
	
	public static void main(String[] args) {
ElectricityBill c1= new ElectricityBill(101,"P",120);
ElectricityBill c2= new ElectricityBill(102,"R",130);
		
System.out.println("Before Updating Rate");
c1.display();
c2.display();

updateRate(7.5);

System.out.println("After Updating Rate");
c1.display();
c2.display();

	}
}
