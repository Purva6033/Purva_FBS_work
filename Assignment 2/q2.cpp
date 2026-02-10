#include<stdio.h>
int main(){
	float a,b,c;
	printf("Enter sides of Triangle: ");
	scanf("%f %f %f",&a,&b,&c);
	
	if(a+b>c&&a+c>b&&b+c>a){
		if(a==b & b==c){
			printf("Triangle is Equilateral");
		}
		else{
				if(a==b || b==c || a==c){
			printf("Triangle is Isoceles");
		}
		else{
			printf("Triangle is Scalen");
		}
	}
	return 0;
}}
