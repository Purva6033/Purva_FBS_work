
public class TestSalesManager {
	
		int id;
		String name;
		double salary;
		double incentive;
		int target;


		TestSalesManager(){
		id=2;
		name="qwerty";
		salary=400;
		incentive = 500;
		target= 100;
		}

		TestSalesManager(int id,String name,double salary,double incentive,int target){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.incentive=incentive;
		this.target=target;
		}

		int getId() {return id;}
		void setId(int id) {this.id=id;}

		String getName() {return name;}
		void setName(String name) {this.name=name;}

		double getSalary() {return salary;}
		void setSalary(double salary) {this.salary=salary;}

		double getIncentive() {return incentive;}
		void setIncentive(double incentive) {this.incentive=incentive;}

		int getTarget() {return target;}
		void setTarget(int target) {this.target=target;}

		void display(){
		System.out.println(id + " " + name + " " + salary + "  " + incentive + " " + target);
		}
		public static void main(String [] args){
		TestSalesManager sm = new TestSalesManager(2,"qwerty",400,500,100);
		sm.display();

		System.out.println(sm.hashCode());
		}}






