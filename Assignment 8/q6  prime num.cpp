#include<stdio.h>
int main(){
	int arr[5]={10,13,5,6,7};
	int flag,i,j;
	
	printf("prime numbers are:\n");
	
	for(i=0;i<5;i++){
		if(arr[i]<=1)
		continue;
		flag=1;
		
		for(j=2;j<arr[i];j++){
			if(arr[i] %j==0){
				flag=0;
				break;
			}
		}
		if(flag==1){
			printf("%d\n",arr[i]);
		}
	}
	return 0;
}
