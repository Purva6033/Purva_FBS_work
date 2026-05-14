class SalesManager{
int id;
String name;
double salary;
double incentive;
int target;


SalesManager(){
id=2;
name="qwerty";
salary=400;
incentive = 500;
target= 100;
}

SalesManager(int id,String name,double salary,double incentive,int target){
this.id=id;
this.name=name;
this.salary=salary;
this.incentive=incentive;
this.target=target;
}

int getId() {return id;}
void setId(int id) {this.id=id;}

String getName() {return name;}
void setName(String name) {this.name=name;}

double getSalary() {return salary;}
void setSalary(double salary) {this.salary=salary;}

double getIncentive() {return incentive;}
void setIncentive(double incentive) {this.incentive=incentive;}

int getTarget() {return target;}
void setTarget(int target) {this.target=target;}

void display(){
System.out.println(id + " " + name + " " + salary + "  " + incentive + " " + target);
}}
public class TestSalesManager{
public static void main(String [] args){
SalesManager sm = new SalesManager(2,"qwerty",400,500,100);
sm.display();

System.out.println(sm.hashCode());
}}





