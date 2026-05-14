#include<stdio.h>
int main(){
	char str[50]="hi I am Purva 866086";
	char ch;
	int found =0,i;
	
	 printf("Enter character to search: ");
    scanf(" %c", &ch);

	for(i=0;str[i]!=0;i++){
		if(str[i]==ch){
	
		found=1;
		break;
		}
	}
	if(found)
	printf("char found");
	else
	printf("not found");
	
	return 0;
	}
