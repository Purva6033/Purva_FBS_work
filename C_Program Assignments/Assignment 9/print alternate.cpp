#include<stdio.h>
void Alternate(int arr[],int n){
	for(int i=0;i<n;i+=2)
	printf("%d ",arr[i]);
}
int main(){
	 int arr[5]={1,2,3,4,5};
    Alternate(arr,5);
    return 0;
}	

