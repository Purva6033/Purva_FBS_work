#include <stdio.h>

void status(float a, float b, char op)
{
    if(op == '+')
        printf("Result = %.2f", a + b);

    else if(op == '-')
        printf("Result = %.2f", a - b);

    else if(op == '*')
        printf("Result = %.2f", a * b);

    else if(op == '/')
    {
        if(b != 0)
            printf("Result = %.2f", a / b);
        else
            printf("Error: Division by zero");
    }

    else if(op == '%')
    {
        if((int)b != 0)
            printf("Result = %d", (int)a % (int)b);
        else
            printf("Error: Modulo by zero");
    }

    else
        printf("Invalid Operator");
}

int main()
{
    float a, b;
    char op;

    printf("Enter first number: ");
    scanf("%f", &a);

    printf("Enter operator (+,-,*,/,%%): ");
    scanf(" %c", &op);

    printf("Enter second number: ");
    scanf("%f", &b);

    status(a, b, op);

    return 0;
}
