
class Employee {
static double bonusRate = 5.0;

String employeeName;
double basicSalary;

Employee(String name,double salary){
	employeeName=name;
	basicSalary=salary;
}

static void updateBonusRate(double newRate) {
	bonusRate=newRate;
}

double calculateSalary() {
	return basicSalary + (basicSalary * bonusRate / 100);
	
}
void display() {
	System.out.println("Employee Name : " + employeeName);
    System.out.println("Basic Salary : " + basicSalary);
    System.out.println("Bonus Rate : " + bonusRate + "%");
    System.out.println("Total Salary : " + calculateSalary());
    System.out.println();
}

public static void main(String[] args) {
	Employee e1 =new Employee("P",50000);
	Employee e2 =new Employee("R",20000);
	
	System.out.println("before updating bonus rate");
	e1.display();
	e2.display();
	
	updateBonusRate(20);
	System.out.println("after updating bouns rate");
	e1.display();
	e2.display();
}
}
