#include<stdio.h>
//#include<string.h>
int main(){
	char str[100];
	char ch;
	
	
gets(str);
//printf("enter string);
//scanf("%s",str);
	printf("enter character to replace");
	scanf("%c",&ch);
	
	for(int i=0; str[i]!='\0';i++){
		if(str[i]==ch)
		
		str[i]='$';
	
}
	printf(" String is %s ",str);
	
	return 0;
}


