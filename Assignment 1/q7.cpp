#include<stdio.h>
int main(){
	float basic,ta,da,hra,total;
	printf("enter salary: ");
	scanf("%f",&basic);
	
	if(basic<= 5000)
	{
		da = basic*10/100;
		ta = basic*20/100;
		hra = basic*25/100;
	}
	else
	{
		da = basic*15/100;
		ta = basic*25/100;
		hra = basic*30/100;
	}
	total = basic+ta+da+hra;
	printf("total salary = %f",total);
	return 0;
	}
