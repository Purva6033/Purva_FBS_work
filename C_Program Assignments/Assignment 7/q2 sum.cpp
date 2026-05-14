#include<stdio.h>
void sum(int *a,int *b){
int sum= *a + *b;
printf("sum is %d",sum);
}
 int main(){
 	int a=8;int b=9;
 	sum(&a,&b);
 	return 0;
 	
 }
