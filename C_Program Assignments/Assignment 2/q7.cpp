#include<stdio.h>
int main(){
	int age;
	
	printf("enter age :");
	scanf("%d",&age);
	
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
	return 0;
}
