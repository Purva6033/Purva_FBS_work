#include<stdio.h>
#include<string.h>

int main(){
	char s1[100]="I am ";
	char s2[100]="Purva";
	char s3[100];
	char *p;
	
	
	//strlen
	printf("Length is: %lu\n",strlen(s1));
	
	//strcpy
	strcpy(s3,s1);
	printf("Copy: %s\n",s3);
	
	//strncpy
	strncpy(s3,s2,2);
	printf("Copy n characters : %s\n",s3);
	
	//strcat
	strcat(s1,s2);
	printf("Concat: %s\n",s1);
	
	//strncat
	strncat(s1,":",2);
	printf("Concates: %s\n",s1);
	
	//strcmp
	printf("Compare: %d\n",strcmp("abc","abcd"));
	
	//strncmp
	printf("Compare: %d\n",strncmp("abc","abcd",3));
	
	//strchr
	p = strchr(s1,'D');
	printf("First R: %s\n", p);
	
	//strrchr
	p = strrchr(s1,'a');
	printf("First 2: %s\n", p);
	
	//strstr
	p = strstr(s1,"Pawar");
	printf("substring:%s\n",p);
	
	//strtok
	char str[]="java,python";
	p=strtok(str,",");
	while(p!=NULL){
		printf("Token :%s\n",p);
		p=strtok(NULL,",");
	}
	
	//memset
	memset(s3,'#',3);
	s3[3] = '\0';
	printf("memset: %s\n",s3);
	
	//memcpy
	memcpy(s3,"code",3);
	s3[4] = '\0';
	printf("memcpy: %s\n",s3);
	
	//memmove
	memmove(s3+1,s3,3);
	printf("memove: %s\n",s3);
	
	//memcmp
	printf("memcmp: %d\n",memcmp("abc","abc",3));
	
	// strspn
    printf("Strspn: %lu\n", strspn("abcd","abc"));

    // strcspn
    printf("Strcspn: %lu\n", strcspn("purva","u"));
    
    //strbrk
    p=strpbrk("purva","va");
    printf("strpbrk: %s\n",p);
    
    //strerror
    printf("strerror: %s\n",strerror(2));
    
    //strcoll
    	printf("strcoll: %d\n",strcoll("abc","abcd"));
    	
    return 0;
}
