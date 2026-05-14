#include<stdio.h>


int main(){
	int start,end,sum=0;
	printf("enter the range");
	scanf("%d %d",&start,&end);
	
	for(int i=start;i<=end;i++){
		int flag=1;
		if(i<=1)
		flag = 0;
		
	for(int j=2;j<i;j++) {
            if(i%j==0) {
                flag= 0;
                break;
	}}
	
	if(flag==1) {
            sum=sum + i;}}
	printf("sum of prime numbers is:%d",sum);	
	return 0;
}
