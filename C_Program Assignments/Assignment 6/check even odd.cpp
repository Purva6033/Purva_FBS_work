#include<stdio.h>
int Checkevenodd(int n){
	if(n%2==0)
	return 1;
	else 
	return 0;
}
int main(){
	int result=Checkevenodd(3);
	if(result)
	printf("even");
	else
	printf("odd");
	return 0;
}
