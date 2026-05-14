#include<stdio.h>
struct book{
	char bookname[50];
	int id;
	char author[50];
	float price;
};

int main(){
	struct book b;
	
	printf("enter book name:");
	scanf(" %[^\n]",b.bookname);
	
	printf("enter book id:");
	scanf("%d",&b.id);
	
	printf("enter author name:");
	scanf(" %[^\n]",b.author);
	
	printf("enter price:");
	scanf("%f",&b.price);
	
	printf("--Book Details");
	printf("Book name: %s\n",b.bookname);
	printf("Book id: %d\n",b.id);
	printf("Author: %s\n",b.author);
	printf("Price: %.2f\n",b.price);
	
	return 0;
}
