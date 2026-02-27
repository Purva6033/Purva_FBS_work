#include<stdio.h>
int main(){
	int arr[5] = { 40,50,10,55,70};
	int temp;
	
	for(int i=0;i<5-1;i++){
		for(int j=0;j<5-1-i;j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];// used bubble sort so will compare two numbers like swap ifgreater them n sort wisely
				arr[i]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
	printf("Sorted array is:\n");
	for(int i=0;i<5;i++){
		printf("%d ",arr[i]);
	}
	return 0;
}
