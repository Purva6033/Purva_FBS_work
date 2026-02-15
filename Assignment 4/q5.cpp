#include<stdio.h>

int main() {
    int num, choice;
    int i, flag = 1;
    int temp, rev = 0, digit, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse a Number\n");
    printf("6. Sum of Digits\n");

    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch(choice) {

        case 1:
            if(num % 2 == 0)
                printf("Number is Even");
            else
                printf("Number is Odd");
            break;

        case 2:
            if(num <= 1)
                flag = 0;
            else {
                for(i = 2; i*i <= num; i++) {
                    if(num % i == 0) {
                        flag = 0;
                        break;
                    }
                }
            }

            if(flag)
                printf("Number is Prime");
            else
                printf("Number is Not Prime");
            break;

        case 3:
            temp = num;
            while(temp != 0) {
                digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            if(rev == num)
                printf("Number is Palindrome");
            else
                printf("Number is Not Palindrome");
            break;

        case 4:
            if(num > 0)
                printf("Positive Number");
            else if(num < 0)
                printf("Negative Number");
            else
                printf("Zero");
            break;

        case 5:
            temp = num;
            while(temp != 0) {
                digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }
            printf("Reverse = %d", rev);
            break;

        case 6:
            temp = num;
            while(temp != 0) {
                digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            printf("Sum of digits = %d", sum);
            break;

        default:
            printf("Invalid Choice");
    }

    return 0;
}

