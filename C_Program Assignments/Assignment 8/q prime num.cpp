#include<stdio.h>
int main(){
	int arr[5]={10,34,5,6,70};
	int flag,i,j;
	
	printf("prime numbers are:\n");
	
	for(i=0;i<5;i++){
		if(arr[i]<=1)
		flag=1;
		
		for(j=0;j<arr[i];j++){
			if(arr[i] %j==0){
				flag=0;
				break;
			}
		}
		if(flag==1){
			printf("%d",arr[i]);
		}
	}
	return 0;
}
