import java.util.Scanner;

abstract class InsurancePolicy {
	protected String policyHolderName;
	protected double basePremium;
	
	InsurancePolicy(String policyHolderName,double basePremium){
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}
	abstract double calculatePremium();
	void printPolicyDetails() {
		System.out.println("\n Policy Holder Name"+ policyHolderName);
		System.out.println("Base premium"+ basePremium);
		System.out.println("final premium" + calculatePremium());
	}
}
 
class CarInsurance extends InsurancePolicy{                  //car
	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue;
	
	CarInsurance(String policyHolderName,double basePremium,int carAgeInYears,boolean hadAccidentInLastYear,double carValue){
		super(policyHolderName,basePremium);
		this.carAgeInYears=carAgeInYears;
		this.hadAccidentInLastYear=hadAccidentInLastYear;
		this.carValue = carValue;
	}
	
	double calculatePremium() {
		double premium = basePremium;
		
		if(carAgeInYears <= 3) {
			premium += basePremium * 0.10;
		}
		else if(carAgeInYears <= 7) {
			premium += basePremium * 0.20;
			
		}
		else {
			premium = basePremium * 0.30;
			}
		if(hadAccidentInLastYear) {
			premium = basePremium * 0.25;
		}
		else {
			premium -= basePremium * 0.10;
		}
		if(carValue > 1000000) {
			premium += 2000;
		}
		return premium;
		
	}
}

class HealthInsurance extends InsurancePolicy {               //health
	int age; 
	boolean isSmoker;
	boolean hasPreExistingDisease;
	
	HealthInsurance(String policyHolderName,double basePremium,int age,boolean isSmoker,boolean hasPreExistingDisease){
		super(policyHolderName,basePremium);
		
		this.age=age;
		this.isSmoker=isSmoker;
	    this.hasPreExistingDisease=hasPreExistingDisease;
	}
	double calculatePremium() {
		double premium = basePremium;
		
		if(age < 30) {
			premium += basePremium * 0.10;
		}
		else if(age <= 45) {
			premium += basePremium * 0.25;
		}
		else {
			premium += basePremium * 0.40;
		}
		if(isSmoker) {
			premium += basePremium * 0.30;
		}
		else {
			premium -= basePremium * 0.05;
		}
		
		if(hasPreExistingDisease) {
			premium += basePremium * 0.20; 
		}
		return premium;
	}
}


public class TestInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
 InsurancePolicy p;
 
 System.out.println("\nSelect policy type");
 System.out.println("1) car insurance");
 System.out.println("2) health insurance");
 
 int choice = sc.nextInt();
 sc.nextLine();
 
 System.out.println("enter policy holder name");
 String name = sc.nextLine();
 
 System.out.println("enetr base premium");
 double basePremium = sc.nextDouble();
 
 if(choice == 1) {
	 System.out.println("enter car age");
	 int age = sc.nextInt();
	 
	 System.out.println("had accident in last year?(true/false)");
	 boolean accident = sc.nextBoolean();
	 
	 System.out.println("enter car value");
	 double carValue = sc.nextDouble();
	 
	 p= new CarInsurance(name,basePremium,age,accident,carValue);
 }
 else {
	 System.out.println("enetr age");
	 int age = sc.nextInt();
	 
	 System.out.println("is smoker?(t/f)");
	 boolean smoker = sc.nextBoolean();
	 
	 System.out.println("has pre existing disease?(t/f)");
	 boolean disease = sc.nextBoolean();
	 
	 p=new HealthInsurance(name,basePremium,age,smoker,disease);
	 
 }
 p.printPolicyDetails();
 sc.close();
	}

}
