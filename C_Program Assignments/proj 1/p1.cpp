#include<stdio.h>
#include<stdlib.h>
#include<string.h>


struct book{
	int id;
	char name[50];
	char author[50];
	char category[50];
	float price;
	float rating;
};

struct book *b;
int count=0;

//-----------------------------file load------------------------//
void loadFromFile() {
    FILE *fp = fopen("books.txt", "r");
    if(fp == NULL) return;

    while(fscanf(fp, "%d %s %s %s %f %f",
        &b[count].id, b[count].name,
        b[count].author, b[count].category,
        &b[count].price, &b[count].rating) != EOF) {
        count++;
    }

    fclose(fp);
}
 
 //-----------------save to file-----------------//
 void saveTofile(){
 	
 }
 
 }
