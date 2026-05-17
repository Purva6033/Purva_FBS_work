package p1;

public abstract class Employee {
	protected int id;
	protected String name;
	protected double salary;
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int getId() {return id;}
	void setId(int id) {this.id=id;}
	
	public String getName() {return name;}
	void setName(String name) {this.name=name;}
	
	public double getSalary() {return salary;}
	void setSalary(double salary) {this.salary=salary;}
	
	public abstract double CalSal();
	
	public String toString() {
		return "id="+ id +", name= " + name + ", salary= " + salary;
		
	}

}
