class Hr{
int id;
String name;
double salary;
double commission;

Hr(){
id=01;
name="abc";
salary=10000;
commission=500;
}

Hr(int id,String name,double salary,double commission){
this.id=id;
this.name=name;
this.salary=salary;
this.commission=commission;
}

int getId() {return id;}
void setId(int id) {this.id=id;}

String getName() {return name;}
void setName(String name) {this.name=name;}

double getSalary() {return salary;}
void setsalary(double salary) {this.salary=salary;}

double getCommission() {return commission;}
void setCommission(double commission) {this.commission=commission;} 
void display(){
System.out.println(id + " " + name + " " + salary + " " + commission);
}
}

public class TestHr{
public static void main (String [] args){
Hr h = new Hr(01,"abc",10000,500);
h.display();
System.out.println(h.hashCode());
}}