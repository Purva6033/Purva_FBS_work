#include<stdio.h>
#include<stdlib.h>

int isprime(int n){
	int i;
	if(n<2)
	return 0;
	
	for(i=2;i<n/2;i++){
		if(n%i==0)
		return 0;
	}
	return 1;
	
	
}
int main(){
	int n,i;
	printf("enter size");
	scanf("%d",&n);
	
	int *a=(int*)malloc(n*sizeof(int));
	
	printf("enter elemets");
	for(i=0;i<n;i++)
	scanf("%d ",&a[i]);
	
	printf("prime numbers in array");
	
	for(i=0;i<n;i++){
		if(isprime(a[i]))
			printf("%d ",a[i]);	
	}
	
	free(a);
	return 0;
}
