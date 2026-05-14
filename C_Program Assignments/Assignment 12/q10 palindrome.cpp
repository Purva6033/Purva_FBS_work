#include<stdio.h>
int main(){
	char str[100];
	int i,j,flag =1;
	gets(str);
	while(str[i]!='\0') i++;
	j=i-1;
	
	for(i=0;i<j;i++,j--	){
		if(str[i]!=str[j]){
			flag=0;
			break;
		}
	}
	if(flag)
	printf("palindrome");
	else
	printf("not palindrome");
	return 0;
}
