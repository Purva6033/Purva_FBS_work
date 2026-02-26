#include<stdio.h>
void maximum(int *a , int *b){
	if(*a > *b)
	printf("maximum = %d",*a);
	else
	printf("maximum = %d",*b);
	
}

int main(){
	int a= 678,b= 9;
	maximum(&a,&b);
	return 0;
}
