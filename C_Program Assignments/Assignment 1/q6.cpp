#include<stdio.h>
int main()
{
	char ch;
	printf("Enter character:");
	scanf("%c",&ch);
	if(ch >='A' && ch<='B')
	{
		printf("uppercase");
	}
	else if(ch >='a'&& ch <='z')
	{
		printf("lowercase");
	}
	else
	{
		printf("not alphabet");
	}
	return 0;
}
