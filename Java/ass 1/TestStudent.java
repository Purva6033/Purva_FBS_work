class Student{
int frn;
String studentName;
double distanceCovered;

Student(){
frn=006;
studentName="Purva";
distanceCovered = 2;
}

Student(int frn , String studentName , double distanceCovered){
this.frn=frn;
this.studentName=studentName;
this.distanceCovered=distanceCovered;
}

int getFrn() {return frn; }
void setFrn(int frn) {this.frn=frn; }

String getStudentName() {return studentName; }
void setStudentName(String studentName) {this.studentName=studentName;}

double getDistanceCovered() {return distanceCovered; }
void setDistanceCovered(double distanceCovered) {this.distanceCovered=distanceCovered;}

 void display(){
System.out.println(frn + " " + studentName + " " + distanceCovered);
}}

public class TestStudent{
public static void main (String [] args){
Student s =new Student(006,"Purva",2);
s.display();
System.out.println(s.hashCode());
}
 }