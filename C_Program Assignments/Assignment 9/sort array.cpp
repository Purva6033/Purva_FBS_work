#include<stdio.h>
void sortArray(int arr[], int n){
    int temp;
    for(int i=0;i<n-1;i++){
    	for(int j=0;j<n-1;j++){
    	if(arr[j]>arr[j+1]){
    	temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
		}
	}
}
for(int i=0;i<n;i++)
printf("%d ",arr[i]);
}
int main(){
	int arr[5]={1,6,3,10,5};
	sortArray(arr,5);
	return 0;
}
