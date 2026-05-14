#include<stdio.h>
int main(){
	char str[10] = "haallo";
	int i;
	for(i=0;str[i]!='\0';i++){
		if(str[i]=='a')
		str[i]='$';	
	}
printf("%s",str);	
return 0;
}
