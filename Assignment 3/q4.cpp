#include<stdio.h>
int main(){
	int no=7;
	int i=2,flag=0;
	while(i<=no/2)
	{
		if(no%i==0)
		flag=1;
		break;
		i++;
	}
	if(flag==0)
	printf("prime");
	else 
	printf("not prime");
	return 0;
}
