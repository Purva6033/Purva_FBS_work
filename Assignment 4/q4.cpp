#include<stdio.h>
int main(){
	
    int n, i, j, sum;

    printf("Enter n: ");
    scanf("%d", &n);

    printf("Perfect numbers between 1 and %d are:\n", n);

    for(i = 2; i <= n; i++) {
        sum = 0;

        for(j = 1; j <= i/2; j++) {
            if(i % j == 0)
                sum += j;
        }

        if(sum == i)
            printf("%d ", i);
    }

    printf("\n");
    return 0;
  }


