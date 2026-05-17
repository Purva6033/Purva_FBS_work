package p3;
import p1.Employee;
import p2.HR;
import p2.SalesManager;
import p2.Admin;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp[] = new Employee[3];
        
       emp[0] = new HR(101,"P",5001,500);
       emp[1] = new SalesManager(102,"Q",10000,1000,100);
       emp[2] = new Admin(103,"R",6500,8500);
       
       for(Employee e : emp) {
    	   System.out.println(e);
    	   System.out.println("calculate salary= " + e.CalSal());
    	   System.out.println("-----*-----");
       }
	}

}
