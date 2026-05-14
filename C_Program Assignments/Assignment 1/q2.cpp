#include<stdio.h>
int main(){

int rev=0,rem,org,n;
printf("Enter a number:");
scanf("%d",&n);
org = n;

while(n!=0){
	rev=rev*10+n%10;
	n=n/10;
}
if(org==rev)
{
	printf("palindrome");
}
else
{
	printf("not palindrome");
}
return 0;
}
