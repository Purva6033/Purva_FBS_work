#include<stdio.h>
int main(){
	int arr[5]={10,34,5,6,70};
	
	printf("alternate numbers in array are:\n");
	
	for(int i=0;i<5;i+=2){
		printf("%d\n",arr[i]);
	}
	return 0;
}
