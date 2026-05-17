package p2;
import p1.Employee;
public class Admin extends Employee {
private double allowance;

public Admin(int id,String name,double salary,double allowance) {
	super(id,name,salary);
	this.allowance=allowance;
}

public double getAllowance() {return allowance;}
void seetAllowance(double allowance) {this.allowance=allowance;}

public double CalSal() {
	return salary + allowance;
}

public String toString() {
	return "admin = " + super.toString() + ", allowance "+ allowance+ "total salary " + CalSal();
	}
}
