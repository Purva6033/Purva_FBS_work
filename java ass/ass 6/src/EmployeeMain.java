
class Employee {

	protected int id;
	protected String name;
	protected double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void calculateSalary() {
		System.out.println("Employee salary:" + salary);
	}
}

class Admin extends Employee{
	double allowance;
	
	Admin(int id,String name,double salary,double allowance){
		super(id,name,salary);
		this.allowance=allowance;
	}
	
		void calculateSalary() {
			System.out.println("Admin salary:" + (salary+allowance));
		
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
	void calculateSalary() {
		
		System.out.println("SalesManager salary:" + (salary+incentive));
}}

class HR extends Employee {
    double commission;

    HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }
    void calculateSalary() {
		System.out.println("HR salary:" + (salary+commission));
}}
public class EmployeeMain {

    public static void main(String[] args) {

        Employee e;

        e = new Admin(101,"Purva",50000,5000);

        e.calculateSalary();

        e = new SalesManager(102,"Rahul",60000,8000,100000);

        e.calculateSalary();

        e = new HR(103,"Sneha",45000,3000);

        e.calculateSalary();
    }}
