#include<stdio.h>
int main(){
	int no;
	printf("enter no:");
	scanf("%d",&no);
	int temp=no;
	int rem,sum=0;
	while(no>0)
	{
		int fact=1;
		rem=no%10;
		int i=rem;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		sum=sum+fact;
		no=no/10;
	
	printf("%d sum",sum);
}
if(sum==temp)
printf("no is strong");
else
printf("no is not strong");

return 0;
}
