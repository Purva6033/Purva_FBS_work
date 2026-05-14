#include<stdio.h>

// 1)Student
struct student{
	int rollNo;
	char name[50];
	float marks;
};

// 2)employee
struct Employee{
	int id;
	char name[50];
	float salary;
};

// 3)admin
struct Admin{
	int id;
	char name[50];
	float salary;
	float allowance;
};

// 4)hr
struct Hr{
	int id;
	char name[50];
	float salary;
	float commission;
};

// 5)salesmanager
struct SalesManager{
    int id;
	char name[50];
	float salary;
	float incentive;
	int target;	
};

// 6)date
struct Date{
	int date,month,year;
};

// 7)time
struct Time{
		int hour,min,sec;
};

// 8)distance
struct Distance{
	int feet,inch;
};

// 9)complex
struct Complex{
	float real,imaginary;
};

//10)product
struct Product{
	int id;
	char name[50];
	int quantity;
	float price;
};

//-------------functions

//pass by value
void displayStudent(struct student s){
	printf("Student Details");
	printf("roll no:%d\n name: %s\n marks: %.2f\n",s.rollNo,s.name,s.marks);
}

//pass by address
void storeEmployee(struct Employee *e){
	printf("enter employee details");
	scanf("%d %s %f",&e->id,e->name,&e->salary);
}

void displayEmployee(struct Employee*e){
	printf("employee details:");
	printf("ID:%d\n Name:%s\n Salary:%.2f\n",e->id,e->name,e->salary);
}

//pass by address-array
void storeProducts(struct Product p[],int n){
	for(int i=0;i<n;i++){
		printf("enter product %d details",i+1);
		scanf("%d %s %d %f",&p[i].id,p[i].name,&p[i].quantity,&p[i].price);
		
	}
}

void displayProducts(struct Product p[],int n){
	for(int i=0;i<n;i++){
		printf(" product details",i+1);
		printf("id:%d name:%s quantity:%d price:%f",p[i].id,p[i].name,p[i].quantity,p[i].price);
		
	}
}


int main(){
	//pass by value
	struct student s1={1,"Pu",90.9};
	displayStudent(s1);
	
	//pass by address
	struct Employee e1;
	storeEmployee(&e1);
	displayEmployee(&e1);
	
	//pass by address - array
	int n;
	printf("enter number of products");
	scanf("%d",&n);
	
	struct Product p[n];
	storeProducts(p,n);
	displayProducts(p,n);
	
	return 0;
}

