#include<stdio.h>
int main()
{
	int num;
	printf("Enter year:");
	scanf("%d",&num);
	if(num%4==0 && num%100!=0 || num%400==0)
	{
		printf("leap year");
	}
	else
	{
		printf("not leap");
	}
	return 0;
}



