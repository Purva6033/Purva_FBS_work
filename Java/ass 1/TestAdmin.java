class Admin{
int id;
String name;
double salary;
double allowance;

Admin(){
id=301;
name="xyz";
salary = 3000;
allowance = 10;
}

Admin(int id,String name,double salary,double allowance){
this.id=id;
this.name=name;
this.salary=salary;
this.allowance=allowance;
}

int getId() {return id;}
void setId(int id) {this.id=id;}

String getName() {return name;}
void setName(String name) {this.name=name;}

double getSalary() {return salary;}
void setSalary(double salary) {this.salary=salary;}

double getAllowance() {return allowance;}
void setAllowance(double allowance) {this.allowance=allowance;}

void display(){
System.out.println(id + " " + name + " " + salary + " " + allowance);
}
}

public class TestAdmin{
public static void main (String [] args){
Admin ta = new Admin(301,"xyz",3000,10);
ta.display();
System.out.println(ta.hashCode());
}}
