#include<stdio.h>
int main(){
	int arr[5]={10,20,30,40,50};
	int sum=0;
	
	for(int i=0;i<5;i++){
		sum=sum+arr[i]; //sum+=arr[i]; can write like this
	}
	printf("Sum is =%d",sum);
	
	return 0;
}
