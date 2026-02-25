//#include<stdio.h>
//float salary(){
//		float basic,ta,da,hra,total;
//	if(basic<= 5000)
//	{
//		da = basic*10/100;
//		ta = basic*20/100;
//		hra = basic*25/100;
//	}
//	else
//	{
//		da = basic*15/100;
//		ta = basic*25/100;
//		hra = basic*30/100;
//	}
//	total = basic+ta+da+hra;
//return total;
//	}
//	
//	int main(){
//float basic = 6000;
//    float totalsalary;
//
//    totalsalary = salary;
//	printf("total salary = %f",totalsalary);
//	
//	return 0;
//}



#include<stdio.h>

float salary(float basic)
{
    float ta, da, hra, total;

    if(basic <= 5000)
    {
        da = basic * 10/100;
        ta = basic * 20/100;
        hra = basic * 25/100;
    }
    else
    {
        da = basic * 15/100;
        ta = basic * 25/100;
        hra = basic * 30/100;
    }

    total = basic + ta + da + hra;
    return total;
}

int main()
{
    float basic = 6000;
    float totalsalary;

    totalsalary = salary(basic);

    printf("Total Salary = %.2f", totalsalary);

    return 0;
}
