#include<stdio.h>
void findPrime(int arr[],int n){
	for(int i=0;i<n;i++){
		int flag=0;
		
	if(arr[i]<2)continue;
	
	for(int j=2;j<arr[i];j++){
		if(arr[i]%j==0){
			flag=1;
			break;
		}
	}
	if(flag==0)
	printf("%d ",arr[i]);
	}
}
int main(){
	 int arr[5]={1,2,3,4,5};
    findPrime(arr,5);
    return 0;
}	

