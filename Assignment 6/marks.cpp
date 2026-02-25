#include<stdio.h>
int status(int marks){
	if(marks>75){
		printf("distinction");	
	}
	else{
			if(marks>65){
		printf("first class");
	}
	else{
			if(marks>55){
		printf("second class");
	}
	else{
			if(marks>45){
		printf("third class");
	}
	else{
			if(marks>55){
		printf("pass class");
	}
	else{
		printf("fail");
	}
}
}}}

}

int main(){
	int marks;
	printf("enter marks:");
	scanf("%d",&marks);
	status(marks);
	return 0;
}
	
