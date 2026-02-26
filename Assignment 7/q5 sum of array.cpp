#include<stdio.h>
void sumarray(int *arr,int n){
	int sum = 0;
	
	for(int i=0;i<n;i++)
	sum =sum +arr[i];
	printf("sum =%d",sum);
}

int main(){
	int arr[3]={1,2,3};
	sumarray(arr,5);
	return 0;
}
