#include <stdio.h>
int main() {
    int n = 12345, first, last, temp;
    last =n%10;
    temp=n;
    while(temp>=10){
    	temp=temp/10;
    }
    first=temp;
    printf("sum=%d",first+last);
    return 0;
	}
