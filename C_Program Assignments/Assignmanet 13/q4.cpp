#include<stdio.h>
#include<stdlib.h>

int main(){
	int n,i;
	
	printf("enter size");
	scanf("%d",&n);
	
	int *a=(int*)malloc(n*sizeof(int));
	
	printf("enter elemnents ");
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	
	printf("even num are ");
	for(i=0;i<n;i++){
		 if(a[i] % 2 ==0)
		 printf("%d\n",a[i]);
}
	printf("odd num are ");
	for(i=0;i<n;i++){
		 if(a[i] % 2 !=0)
		 printf("%d ",a[i]);
	}
	
	free(a);
	return 0;
}
