package p2;
import p1.Employee;
public class SalesManager extends Employee{
 private double incentive;
 private double target;
 
 public SalesManager(int id,String name,double salary,double incentive,double target) {
	 super(id,name,salary);
	 this.incentive=incentive;
	 this.target=target;
 }
 
 public double getIncentive() {return incentive;}
 void setIncentive(double incentive) {this.incentive=incentive;}
 
 public double getTarget() {return target;}
 void setTarget(double target) {this.target=target;}
 
 public double CalSal() {
	 return salary + incentive + target;
 }
 public String toString() {
	 return "Salesmanager=" + super.toString() + ",incentive= " + incentive + ",target= " + target + ",total salary = " + CalSal();
 } 
 
 
}
