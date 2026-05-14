class Employee{
int id;
String name;
double salary;

Employee(){
id=101;
name="Pu";
salary=50000;
}
Employee(int id,String name,double salary){
this.id=id;
this.name=name;
this.salary=salary;
}

int getId() {return id;}
void setId(int id) {this.id=id;}

String getName()  {return name;}
void setName(String name) {this.name=name;}

double getSalary() {return salary;}
void setSalary(double salary) {this.salary=salary;}

void display(){
System.out.println(id + " " + name + " " + salary);
}
}

public class TestEmployee{
public static void main(String [] args){
Employee e = new Employee(101,"Pu",50000);
e.display();
System.out.println(e.hashCode());
}}