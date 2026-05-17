package p2;
import p1.Employee;
public class HR extends Employee {
private double commission;

public HR(int id,String name,double salary,double commission) {
	super(id,name,salary);
	this.commission=commission;
}

public double getCommission() {return commission;}
void seetCommission(double commission) {this.commission=commission;}

public double CalSal() {
	return salary + commission;
}

public String toString() {
	return "hr = " + super.toString() + ", commission "+ commission + "total salary " + CalSal();
	}
}
