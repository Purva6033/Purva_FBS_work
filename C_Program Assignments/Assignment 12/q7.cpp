#include<stdio.h>
int main(){
	char str[100],newstr[100];
	int i,j=0;
	gets(str);
	for(i=0;str[i]!='\0';i++){
		if(i %2==0)
		newstr[j++]=str[i];
		
	}
	newstr[j]='\0';
	printf("%s",newstr);
	return 0;
	
}
