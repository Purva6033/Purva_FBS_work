#include<stdio.h>
void findSum(int arr[],int n){
int sum=0;
for(int i=0;i<n;i++)
	sum+=arr[i];
	
	printf("Sum is %d\n",sum);
}
int main(){
	int arr[5]={10,20,30,40,79};
	findSum(arr,5);
	return 0;
}
