#include<stdio.h>
void leapyear(int num){

	if(num%4==0 && num%100!=0 || num%400==0)
	{
		printf("leap year");
	}
	else
	{
		printf("not leap");
	}

}
int main()
{
	int num;
	leapyear(2024);
	return 0;	
}

