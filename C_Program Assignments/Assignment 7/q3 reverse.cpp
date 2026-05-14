#include<stdio.h>
void reverse(int *n){
	int rev=0,rem,temp= *n;
	while(temp != 0){
		rem = temp % 10;
		rev = rev * 10 + rem;
		temp /=10;
	}
	printf("Reverse  = %d",rev);
	
}

int main(){
	int n = 123;
	reverse(&n);
	return 0;
}
