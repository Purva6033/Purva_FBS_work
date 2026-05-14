#include<stdio.h>
#include<stdlib.h>
int main(){
	int n,i,key,found=0;
	scanf("%d",&n);
	int *a=(int*)malloc(n*sizeof(int));
	for(i=0;i<n;i++) scanf("%d",&a[i]);
	scanf("%d",&key);
	for(i=0;i<n;i++){
		if(a[i]==key){
			found=1;
			break;
		}
	}
	if(found)printf("found");
	else printf("not found");
	
free(a);
return 0;
}
