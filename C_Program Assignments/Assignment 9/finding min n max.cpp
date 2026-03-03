#include<stdio.h>
void findminmax(int arr[],int n){
int min=arr[0],max=arr[0];

for(int i=0;i<5;i++){
	if(arr[i]<min) min=arr[i];
	if(arr[i]>max) max=arr[i];
}
printf("Min= %d\n Max= %d\n",min,max);	
	
}
int main(){
	int arr[5]={10,20,30,40,50};
	findminmax(arr,5);
	return 0;
}
