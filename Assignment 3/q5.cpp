#include<stdio.h>
int main(){
	int n,temp,remainder,sum=0;
	printf("enter number:");
	scanf("%d",&n);
	temp=n;
	while(temp !=0){
		remainder=temp%10;
		sum=sum+(remainder*remainder*remainder);
		temp=temp/10;
	}
	if(sum==n)
	printf("armstrong");
	else
	printf("not a armstrong");
	
	return 0;
}
