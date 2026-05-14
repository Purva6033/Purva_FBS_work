#include<stdio.h>
void reverseArray(int arr[],int n){
	int temp;
	for(int i=0;i<n/2;i++){
		temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1]=temp;
	}
	for(int i=0;i<n;i++)
	printf("%d ",arr[i]);
	
}
int main(){
	int arr[5]={10,20,30,40,79};
	reverseArray(arr,5);
	return 0;
}
