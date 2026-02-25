#include<stdio.h>
void greaterno(int a,int b,int c)
{
    if(a>=b && a>=c)
        printf("%d is greater",a);
    else if(b>=a && b>=c)
        printf("%d is greater",b);
    else
        printf("%d is greater",c);
}
int main(){
	int a,b,c;
	printf("Enter the numbers:");
	scanf("%d %d %d",&a,&b,&c);
	greaterno(a,b,c);
	return 0;
}
