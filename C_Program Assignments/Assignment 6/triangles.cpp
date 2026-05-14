#include<stdio.h>
void triangle(float a,float b,float c){
		
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
	
}}
int main(){
float a,b,c;
	printf("Enter sides of Triangle: ");
	scanf("%f %f %f",&a,&b,&c);
	triangle(a,b,c);
	return 0;
}
