#include<stdio.h>
int main(){
	float price,discount,finalprice;
	char student;
	
	printf("enter purchase price:");
	scanf("%f",&price);
	
	printf("are you a student?(y/n):");
	scanf(" %c",&student);
	
	if(student=='y' || student=='Y'){
		if(price>500){
			discount = price*20/100;
			
		}
		else{
			discount = price*10/100;
		}
	}
	else{
		if(price>600){
			discount = price*15/100;
		}
		else{
			discount = 0;
		}
	}
	finalprice = price - discount;
	
	printf("discount = %f\n",discount);
	printf("final price = %f",finalprice);
	return 0;
}
