class Student{
	int rollNo;
	String name;
	double percentage;
	
	Student(int rollNo,	String name,double percentage){
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
	}
}

class Employee{
	int id;String name;double annualSalary;
	
	Employee(int id, String name, double annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }
}
	class Bank{
		void approveLoan(Student s) {
			System.out.println("\nStudent Details");
	        System.out.println("Roll No: " + s.rollNo);
	        System.out.println("Name: " + s.name);
	        System.out.println("Percentage: " + s.percentage + "%");
	        
	        
			
			if(s.percentage >= 80) {
	        	System.out.println("Loan approved:2,00,000/-");
	        }
	        
	        if(s.percentage >= 60) {
	        	System.out.println("Loan approved:1,00,000/-");
	        }
	        
	        if(s.percentage >= 40) {
	        	System.out.println("Loan approved:50,000/-");
	        }
	        
	        else {
	        	System.out.println("No loan approved");
	        }
	        		
		}
		
		void approveLoan(Employee e) {
			
			System.out.println("\nEmployee Details");
	        System.out.println("Employee ID: " + e.id);
	        System.out.println("Name: " + e.name);
	        System.out.println("Annual Salary: " + e.annualSalary + " LPA");

	        if (e.annualSalary > 12) {
	            System.out.println("Loan Approved: ₹7,00,000");
	        } 
	        else if (e.annualSalary >= 10) {
	            System.out.println("Loan Approved: ₹6,00,000");
	        } 
	        else if (e.annualSalary >= 6) {
	            System.out.println("Loan Approved: ₹5,00,000");
	        } 
	        else if (e.annualSalary >= 4) {
	            System.out.println("Loan Approved: ₹4,00,000");
	        } 
	        else {
	            System.out.println("No Loan Approved");
	        }
	        }
		
		
		}
	

public class loan {
	public static void main(String [] args) {
		Bank b=new Bank();
		
		Student s1=new Student(01,"Rahul",85);
		Student s2=new Student(02,"Ram",50);
		
		Employee e1=new Employee(101,"P",11);
		Employee e2=new Employee(102,"Q",10);
		Employee e3=new Employee(103,"R",3);
		

        b.approveLoan(s1);
        b.approveLoan(s2);

        b.approveLoan(e1);
        b.approveLoan(e2);
        b.approveLoan(e3);
		
	}
		
	}


