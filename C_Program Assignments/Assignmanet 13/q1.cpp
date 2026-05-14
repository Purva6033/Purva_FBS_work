#include<stdio.h>
#include<stdlib.h>
int main(){
	int i,n;
	scanf("%d",&n);
	
	int *a = (int*)malloc(n*sizeof(int));
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	
	int min =a[0], max =a[0];
	for(i=1;i<n;i++){
		if(a[i]>max)  max=a[i];
		if(a[i]<min)  min=a[i];
			}
			
	printf("min is %d max is %d",min,max);
	return 0;
	
}
