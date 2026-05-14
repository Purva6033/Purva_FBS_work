class EmployeeDetails {

    protected int id;
    protected String name;
    protected double salary;

    EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class AdminEmployee extends EmployeeDetails {

    double allowance;

    AdminEmployee(int id, String name,double salary, double allowance) {

        super(id, name, salary);
        this.allowance = allowance;
    }
}

class SalesManagerEmployee extends EmployeeDetails {

    double incentive;
    double target;

    SalesManagerEmployee(int id, String name,double salary, double incentive, double target) {

        super(id, name, salary);

        this.incentive = incentive;
        this.target = target;
    }
}

class HREmployee extends EmployeeDetails {

    double commission;

    HREmployee(int id, String name,double salary, double commission) {

        super(id, name, salary);
        this.commission = commission;
    }
}
 class TestEmployee{
	 public static void main(String[] args) {
		AdminEmployee a=new AdminEmployee(102,"s",8000,800);
		SalesManagerEmployee s=new SalesManagerEmployee(106,"j",50000,4500,100);
		HREmployee hr = new HREmployee(109,"f",5600,230);
		
		System.out.println("employee hierarchy");
		a.displayEmployee();
		s.displayEmployee();
		hr.displayEmployee();
		
	}
 }