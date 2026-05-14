#include<stdio.h>
#include<stdlib.h>

int main(){
	int n,i;
	
	printf("enter size");
	scanf("%d",&n);
	
 int *a=(int*)malloc(n*sizeof(int));	
 int *b=(int*)malloc(n*sizeof(int));	
 int *c=(int*)malloc(n*sizeof(int));	
 
 printf("enter elements of first array");
 for(i=0;i<n;i++)
 scanf("%d",&a[i]);
 
  printf("enter elements of second array");
 for(i=0;i<n;i++)
 scanf("%d",&b[i]);
 
 for(i=0;i<n;i++)
 c[i]=a[i]+b[i];
 
 printf("sum array");
 for(i=0;i<n;i++)
 printf("%d ",c[i]);
 
 free(a);
 free(b);
 free(c);
 
 return 0;		
}
