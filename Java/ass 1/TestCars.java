class Cars{
int wheels;
String model;
double licensenum;
double dieselprice;

Cars(){
wheels = 4;
model = "bmw";
licensenum = 862586;
dieselprice = 150;
}

Cars(int wheels,String model,double licensenum,double dieselprice){
this.wheels=wheels;
this.model=model;
this.licensenum=licensenum;
this.dieselprice=dieselprice;
}

int getWheels() {return wheels; }
void setWheels(int wheels) {this.wheels=wheels; }

String getModel() {return model; }
void setmodel(String model) {this.model=model; }

double getLicensenum() {return licensenum; }
void setLicensenum(double licensenum) {this.licensenum=licensenum; }

double getDieselprice() {return dieselprice; }
void setDieselprice(double dieselprice) {this.dieselprice=dieselprice; }

void display(){
System.out.println(wheels + " " + model + " " + licensenum + " " + dieselprice );
}
 }

public class TestCars{
public static void main(String [] args){
Cars c = new Cars(4,"bmw",862586,150);
c.display();
System.out.println(c.hashCode());
}}