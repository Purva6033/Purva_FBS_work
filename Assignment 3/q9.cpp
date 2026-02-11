#include<stdio.h>
int main(){
	int n=121,rev =0,original;
	original=n;
	while(n!=0){
	rev=rev*10 + n %10;
	n=n/10;
}
	if(original==rev)
	printf("palindrome");
	else 
	printf("not palindrome");
	return 0;
	
}
