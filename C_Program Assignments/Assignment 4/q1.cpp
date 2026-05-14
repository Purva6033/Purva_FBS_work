#include <stdio.h>
#include <math.h>

int main() {
    int n, i, num, digit, sum, count;
    
    printf("Enter value of n: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++) {
        num = i;
        count = 0;
        
        while(num!=0)
        {
        	count++;
        	num=num/10;
		}
	num=i;
	sum=0;
	
	while(num!=0){
		digit=num%10;
		sum=sum+pow(digit,count);
		num=num/10;
	}
	
	if(sum==i)
	printf("%d",i);
}return 0;
}
