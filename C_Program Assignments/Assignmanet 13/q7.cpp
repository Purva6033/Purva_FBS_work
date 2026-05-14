#include<stdio.h>
#include<stdlib.h>

int main(){
	int n1,n2,i;
	scanf("%d",&n1);
	
	int *a=(int*)malloc(n1*sizeof(int));
	for(i=0;i<n1;i++) scanf("%d",&a[i]);
	
	scanf("%d",&n2);
	
	int *b=(int*)malloc(n2*sizeof(int));
	for(i=0;i<n2;i++) scanf("%d",&b[i]);
	
	int *c=(int*)malloc((n1+n2)*sizeof(int));
	
	for(i=0;i<n1;i++) c[i]=a[i];
	for(i=0;i<n2;i++) c[n1+i]=b[i];
	
	for(i=0;i<n1+n2;i++) print
	f("%d",c[i]);
	
	return 0;
	
}
