class Book{
int version;
double pages;
String name;

Book(){
version = 1;
pages = 100;
name = "wings";
}

Book(int version,double pages,String name){
this.version=version;
this.pages=pages;
this.name=name;
}

int getVersion() {return version;}
void setVersion(int version) {this.version=version; }

double getPages() {return pages; }
void setPages(double pages) {this.pages=pages; }

String getName() {return name; }
void setName(String name) {this.name=name; }

void display(){
System.out.println(version + " " + pages + " " + name);
}
}

public class TestBook{
public static void main(String [] args){
Book bo = new Book(1,100,"wings");
bo.display();
System.out.println(bo.hashCode());
}}