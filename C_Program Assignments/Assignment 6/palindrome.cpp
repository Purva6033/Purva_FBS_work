#include<stdio.h>
int palindrome(){
	int n=121,original,rev=0;
	original=n;
	
	while(n!=0){
		rev=rev*10 + n%10;
		n=n/10;
	}
	return(original==rev);
}

int main(){
	if(palindrome())
		printf("no is palindrome");
		else
		printf("no is not palindrome");
	return 0;
}
