#include <stdio.h>
#include <ctype.h> 

//a) mystrcpy
char* mystrcpy (char *dest ,char *src){

int i=0;
while(src[i] != '\0'){
	dest[i]=src[i];
	i++;
}
dest[i]='\0';
return dest;
}

//b)mystrlen
int mystrlen (char *str){
	int i=0;
	while(str[i]!='\0'){
		i++;
	
	}
	return i;
}

//c)mystrcmp
int mystrcmp (char *s1,char *s2){
	int i=0;
	while(s1[i]==s2[i]){
		if(s1[i]=='\0')
		return 0;
		i++;
	}
	return s1[i] - s2[i];
}

//d)mystrcat
char* mystrcat(char *dest, const char *src) {
    int i = 0, j = 0;

    while(dest[i]!='\0') i++;

    while(src[j]!='\0') {
        dest[i++]=src[j++];
    }

    dest[i] = '\0';
    return dest;
}

//e)mystrncpy
char *mystrncpy(char *dest, const char *src, int n) {
    int i;
    for(i = 0; i < n && src[i] != '\0'; i++)
        dest[i] = src[i];

    for(; i < n; i++)
        dest[i] = '\0';

    return dest;
}

//f)mystrupper
char* mystrupper (char *str){
	int i=0;
	while(str[i]!='\0'){
		if(str[i]>='a' && str[i]<='z')
		str[i]=str[i]-32;
		i++;
	}
	return str;
}
//g)mystrlower
char* mystrlower (char *str){
	int i=0;
	while(str[i]!='\0'){
		if(str[i]>='A' && str[i]<='Z')
		str[i]=str[i]+32;
		i++;
	}
	return str;
}

//h)mystrrev
char *mystrrev (char *str){
	int i=0,j=mystrlen(str)-1;
	char temp;
	while(i<j){
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		i++;
		j--;
	}
	return str;
	}

//i)mystrstr
char* mystrstr(char *str, char *sub) {
    int i, j;

    for(i = 0; str[i] != '\0'; i++) {
        for(j = 0; sub[j] != '\0'; j++) {
            if(str[i + j] != sub[j])
                break;
        }
        if(sub[j] == '\0')
            return &str[i];
    }
    return NULL;
}
//j)mystrcasecmp
int mystrcasecmp(char *s1, char *s2) {
    int i = 0;
    while(s1[i] && s2[i]) {
        char c1 = s1[i];
        char c2 = s2[i];
        if(c1 >= 'A' && c1 <= 'Z') c1 += 32;
        if(c2 >= 'A' && c2 <= 'Z') c2 += 32;
        if(c1 != c2)
            return c1 - c2;
        i++;
    }
    return s1[i] - s2[i];
}

//k)mystrchr
char* mystrchr(char *str, char ch) {
    int i = 0;
    while(str[i] != '\0') {
        if(str[i] == ch)
            return &str[i];
        i++;
    }
    return NULL;
}

//l)mystrrchr
char* mystrrchr(char *str, char ch) {
    char *last = NULL;
    int i = 0;
    while(str[i] != '\0') {
        if(str[i] == ch)
            last = &str[i];
        i++;
    }
    return last;
}

//m)mystrncmp
int mystrncmp(char *s1, char *s2, int n) {
    for(int i = 0; i < n; i++) {
        if(s1[i] != s2[i] || s1[i] == '\0' || s2[i] == '\0')
            return s1[i] - s2[i];
    }
    return 0;
}

//n)mystrnstr
char* mystrnstr(char *str, char *sub, int n) {
    int i, j;
    for(i = 0; i < n && str[i] != '\0'; i++) {
        for(j = 0; sub[j] != '\0' && (i + j) < n; j++) {
            if(str[i + j] != sub[j])
                break;
        }
        if(sub[j] == '\0')
            return &str[i];
    }
    return NULL;
}

//o)mystrncat
char* mystrncat(char *dest, char *src, int n) {
    int i = 0, j = 0;
    while(dest[i] != '\0')
        i++;
    while(src[j] != '\0' && j < n) {
        dest[i++] = src[j++];
    }
    dest[i] = '\0';
    return dest;
}

//p)mystrncasecmp
int mystrncasecmp(char *s1, char *s2, int n) {
    for(int i = 0; i < n; i++) {
        char c1 = s1[i];
        char c2 = s2[i];
        if(c1 >= 'A' && c1 <= 'Z') c1 += 32;
        if(c2 >= 'A' && c2 <= 'Z') c2 += 32;

        if(c1 != c2 || c1 == '\0' || c2 == '\0')
            return c1 - c2;
    }
    return 0;
}

int main() {
    char str1[100] = "Hello";
    char str2[100] = "Purvaa";
    printf("Length: %d\n", mystrlen(str1));
    mystrcat(str1, str2);
    printf("Concat: %s\n", str1);
    printf("Compare: %d\n", mystrcmp("abc", "abc"));
    mystrrev(str1);
    printf("Reverse: %s\n", str1);

    return 0;
}
