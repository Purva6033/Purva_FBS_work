#include<stdio.h>
void divisibility(int num){
	if(num %3 == 0){
		if(num %5 ==0){
			printf("divisible by both");
		}
		else{
			printf("divisible by 3 not 5");
		}
	}
	else{
		if(num %5 ==0){
			printf("divisible by 5 not 3");
		}
	
	else {
    printf("divisible by none");
}
}

}
int main(){
	int num;
	
	printf("enter a number:");
	scanf("%d", &num);
	divisibility(num);
		return 0;}
	
