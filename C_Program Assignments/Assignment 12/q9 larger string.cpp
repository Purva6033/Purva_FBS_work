#include<stdio.h>
int length(char str[]) {
    int i=0;
    while(str[i] != '\0') i++;
    return i;
}
int main() {
    char s1[100], s2[100];
    gets(s1);
    gets(s2);
    if(length(s1) > length(s2))
        printf("Larger: %s", s1);
    else
        printf("Larger: %s", s2);
    return 0;
}
