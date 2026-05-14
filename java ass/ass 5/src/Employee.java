class Employee {

	protected int id;
	protected String name;
	protected double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void displayEmployee() {
		System.out.println(id + " " + name + " " + salary);
	}
}

class Admin extends Employee{
	double allowance;
	
	Admin(int id,String name,double salary,double allowance){
		super(id,name,salary);
		this.allowance=allowance;
	}
}

class SalesManager extends Employee{
	double incentive;
	double target;
	
	SalesManager(int id,String name,double salary,double incentive,double target){
		super(id,name,salary);
		this.incentive=incentive;
		this.target=target;
	}
}

class HR extends Employee {
    double commission;

    HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }
}