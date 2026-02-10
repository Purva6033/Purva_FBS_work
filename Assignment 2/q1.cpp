#include <stdio.h>
int main(){
	float a,b;
	char op;
	
	printf("Enter first num:");
	scanf("%f",&a);
	
	printf("Enter operator( +,-,%,*,/):");
	scanf(" %c",&op);
	
	printf("Enter second num:");
	scanf("%f",&b);
	
	if(op=='+'){
		printf("Result =%f",a+b);
	}
	else{
			if(op=='-'){
		printf("Result =%f",a-b);
	}
	else {
			if(op=='%'){
				if((int)b!=0)
		printf("Result =%d",(int)a % (int)b);
		else
		printf("error,div by zero");
	}
	else {
			if(op=='*'){
		printf("Resul =%f",a*b);
	}
	else{
			if(op=='/'){
					if((int)b!=0)
		printf("Result =%f",a/b);
		else
		printf("error,mod by zero");
	}
	else{
		printf("Invalid Operator");
	}
}
}
}
}
return 0;
}


