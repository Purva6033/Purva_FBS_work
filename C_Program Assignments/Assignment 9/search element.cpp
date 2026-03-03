#include<stdio.h>
void searchElement(int arr[],int n,int key){
	for(int i=0;i<n;i++){
		if(arr[i]==key){
			printf("Element found\n");
			return;
		}
	}
	printf("Eelement not found\n");
}

int main(){
	int arr[5]={10,20,30,40,50};
	searchElement(arr,5,30);
	return 0;
}
