#include<stdio.h>
int checkvowelconsonant(){

	if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
	{
		printf("vowel");
	}
	else
	{
		printf("consonant");
	}

}
int main(){
	char ch;
	  checkvowelconsonant();
	printf("Enter a character: ");
	scanf("%c",&ch);
		return 0;
}
