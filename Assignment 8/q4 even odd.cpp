#include<stdio.h>
int main(){
	int arr[5]={10,20,3,40,5};

    printf("even numbers are: ");
    for(int i=0;i<5;i++){
        if(arr[i] % 2 == 0){
            printf("%d ", arr[i]);
        }
    }

    printf("\nodd numbers are: ");
    for(int i=0;i<5;i++){
        if(arr[i] % 2 != 0){
            printf("%d ", arr[i]);
        }
    }

    return 0;
}
	
