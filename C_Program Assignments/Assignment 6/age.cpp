#include<stdio.h>
void person(int age){
	if(age <12){
		printf("child");
	}
	else{
		if(age <19){
		printf("teenager");
	}
	else{
		if(age <59){
		printf("adult");
	}
	else{
		printf("senoir");
	}
	}
	}

}
int main(){
	int age;
	
	printf("enter age :");
	scanf("%d",&age);
	person(age);
		return 0;}
	
