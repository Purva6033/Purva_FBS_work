#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct Book {
    int id;
    char name[50];
    char author[50];
    char category[30];
    float price;
    float rating;
};

struct Book b[100];
int count = 0;

// -------- LOAD FROM FILE --------
void loadFromFile() {
    FILE *fp = fopen("books.txt", "r");
    if(fp == NULL) return;

    while(1) {
        int result = fscanf(fp, "%d\n%[^\n]\n%[^\n]\n%[^\n]\n%f\n%f\n",
            &b[count].id,
            b[count].name,
            b[count].author,
            b[count].category,
            &b[count].price,
            &b[count].rating);

        if(result == EOF) break;
        if(result != 6) break;

        count++;
        if(count >= 100) break;
    }

    fclose(fp);
}

// -------- SAVE TO FILE --------
void saveToFile() {
    FILE *fp = fopen("books.txt", "w");

    for(int i = 0; i < count; i++) {
        fprintf(fp, "%d\n%s\n%s\n%s\n%.2f\n%.1f\n",
            b[i].id,
            b[i].name,
            b[i].author,
            b[i].category,
            b[i].price,
            b[i].rating);
    }

    fclose(fp);
}

// -------- ADD BOOK --------
void addBook() {
    printf("Enter ID: ");
    scanf("%d", &b[count].id);

    printf("Enter Name: ");
    scanf(" %[^\n]", b[count].name);

    printf("Enter Author: ");
    scanf(" %[^\n]", b[count].author);

    printf("Enter Category: ");
    scanf(" %[^\n]", b[count].category);

    printf("Enter Price: ");
    scanf("%f", &b[count].price);

    printf("Enter Rating: ");
    scanf("%f", &b[count].rating);

    count++;
    printf("Book Added Successfully!\n");
}

// -------- DISPLAY --------
void display() {
    if(count == 0) {
        printf("\nNo Books Available\n");
        return;
    }

    printf("\n----- ALL BOOKS -----\n");

    for(int i = 0; i < count; i++) {
        printf("\nBook %d\n", i+1);
        printf("ID: %d\n", b[i].id);
        printf("Name: %s\n", b[i].name);
        printf("Author: %s\n", b[i].author);
        printf("Category: %s\n", b[i].category);
        printf("Price: %.2f\n", b[i].price);
        printf("Rating: %.1f\n", b[i].rating);
    }
}

// -------- MAIN --------
int main() {
    int choice;

    loadFromFile();   // ?? important

    while(1) {
        printf("\n===== BOOK MANAGEMENT APP =====\n");
        printf("1. Add Book\n");
        printf("2. Display All Books\n");
        printf("0. Exit\n");

        printf("Enter choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                addBook();
                break;

            case 2:
                display();
                break;

            case 0:
                saveToFile();
                printf("Data saved. Exiting...\n");
                return 0;

            default:
                printf("Invalid choice\n");
        }
    }
}
