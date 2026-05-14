#include<stdio.h>
int main(){

	int start, end, sum = 0;

    printf("Enter start number: ");
    scanf("%d", &start);

    printf("Enter end number: ");
    scanf("%d", &end);
    
	for(int i=start;i<=end;i++)
	sum=sum+i;
	{
		printf("sum is %d",sum);
	}
	return 0;
}
