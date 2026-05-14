#include<stdio.h>
int main(){
	char str[20] = "java fullstack";
	int i,temp;
	while(str[i]!='\0')i++;
	temp=str[0];
	str[0]=str[i-1];
	str[i-1]=temp;
	printf("%s",str);
	return 0;
	
}
