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


class TestEmp{
public static void main(String [] args){
 Employee[] arr;
arr=new Employee[3];
arr[0]=new Employee();
arr[1]=new Employee(18,"V",5000);
arr[2]=new Employee();

for(int i=0;i<arr.length;i++){
arr[i].display();
}

}}


