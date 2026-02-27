#include<stdio.h>
void alphabets(char ch){
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

}
int main()
{
	
	char ch ='a';
	alphabets(ch);
}
