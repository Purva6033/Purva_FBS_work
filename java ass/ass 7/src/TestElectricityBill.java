import java.util.Scanner;

abstract class ElectricityBill {
	protected String customerName;
	protected int units;
	
	ElectricityBill(String customerName,int units){
		this.customerName = customerName;
		this.units=units;
	}
	
	void showUsage() {
		System.out.println("\nCustomer name:" + customerName);
		System.out.println("Units counsumed: "+ units);
	} 
	
	abstract double calculateBill();
	final void generateBill() {
		double bill = calculateBill();
		bill = bill + (bill * 0.05);
		
		bill = bill + 50;
		
		System.out.println("final bill amt:" + bill);
		
	}
}


class ResidentialBill extends ElectricityBill {                //residential
	
	ResidentialBill(String customerName,int units){
		super(customerName,units);
		
	}
	double calculateBill() {
		double bill = 0;
		
		if(units <= 100) {
			bill = units * 2.5;
			
		}
		else if(units <= 300) {
			bill = units * 3.5;
		
		}
		else {
			bill=units * 5;
		}
		
		if(units > 500) {
			bill = bill + 150;
		}
		return bill;
	}
}  

class CommercialBill extends ElectricityBill{                 //Commercial
	CommercialBill(String customerName,int units){
		super(customerName,units);
	}
	double calculateBill() {
		double bill = units * 6.5;
		if(units < 200) {
			if(bill<1500) {
				bill = 1500;
			}
		}
		
		if(units > 1000) {
			bill = bill + (bill * 0.08);
		}
		
		return bill;
		
	}
	
}                       


 class TestElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        ElectricityBill e;
        
        System.out.println("Select type");
        System.out.println("1) residential");
        System.out.println("2) commercial");
        
        int choice = sc.nextInt();
        sc.nextLine();
        
        System.out.println("enter name:");
        String name = sc.nextLine();
        
        System.out.println("enter units consumed");
        int units = sc.nextInt();
        
        if(choice == 1) {
        	e=new ResidentialBill(name,units);
        }
        else {
        	e=new CommercialBill(name,units);
        }
        e.showUsage();
        e.generateBill();
        sc.close();
        
	}

}
