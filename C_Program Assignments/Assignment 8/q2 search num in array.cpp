#include<stdio.h>
int main(){
	int arr[5]={10,20,30,40,50};
	int num;
	int found=0;
	
	printf("enter number to search:");
	scanf("%d",&num);
	
	for(int i=0;i<5;i++){
		if(arr[i]==num){
			printf("Number found at position %d",i+1);
			found=1;
			break;
		}
	}
	if(found==0){
		printf("Number not found");
	}
	return 0;
}
