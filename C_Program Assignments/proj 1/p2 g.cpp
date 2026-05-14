#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX 100

typedef struct {
    int jersey;
    char name[50];
    int runs;
    int wickets;
    int matches;
} Player;

Player database[MAX];
int count = 0;

// -------- clear buffer (if invalid) --------
void clearBuffer() {
    while (getchar() != '\n');
}

// --------load data--------
void loadFromFile() {
    FILE *fp = fopen("players.txt", "rb");
    if (fp == NULL) return;

    count = fread(database, sizeof(Player), MAX, fp);
    fclose(fp);
}

// -----save to file--------
void saveToFile() {
    FILE *fp = fopen("players.txt", "wb");
    if (fp == NULL) return;

    fwrite(database, sizeof(Player), count, fp);
    fclose(fp);
}

// ----add p------
void addPlayer() {
    if (count >= MAX) {
        printf("Database Full!\n");
        return;
    }

    int jersey;
    printf("Jersey: ");
    scanf("%d", &jersey);

    //------if duplicate check----------
    for (int i = 0; i < count; i++) {
        if (database[i].jersey == jersey) {
            printf("Jersey already exists!\n");
            return;
        }
    }

    database[count].jersey = jersey;

    printf("Name: ");
    scanf(" %[^\n]", database[count].name);

    do {
    printf("Runs (>0): ");
    scanf("%d", &database[count].runs);
   } while (database[count].runs < 0);

    do{
    printf("Wickets (>0): ");
    scanf("%d", &database[count].wickets);
	} while (database[count].wickets);
 
    do{
    printf("Matches: ");
    scanf("%d", &database[count].matches);
    }while (database[count].matches);  
    count++;
    saveToFile();

    printf("Player Added!\n");
}

// --------remove player--------
void removePlayer() {
    int j, found = 0;

    printf("Enter Jersey: ");
    scanf("%d", &j);

    for (int i = 0; i < count; i++) {
        if (database[i].jersey == j) {
            for (int k = i; k < count - 1; k++) {
                database[k] = database[k + 1];
            }
            count--;
            saveToFile();
            printf("Player Removed!\n");
            found = 1;
            break;
        }
    }

    if (!found) printf("Player Not Found!\n");
}

// ---dispaly players-----
void displayTable() {
    if (count == 0) {
        printf("No Data!\n");
        return;
    }

    printf("\n%-10s %-20s %-10s %-10s %-10s\n",
           "JERSEY", "NAME", "RUNS", "WICKETS", "MATCHES");

    for (int i = 0; i < count; i++) {
        printf("%-10d %-20s %-10d %-10d %-10d\n",
               database[i].jersey,
               database[i].name,
               database[i].runs,
               database[i].wickets,
               database[i].matches);
    }
}

// -----search-------
void searchPlayer() {
    int choice, found = 0;
    int j;
    char name[50];

    printf("\n1. Search by Jersey\n2. Search by Name\nChoice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        printf("Enter Jersey: ");
        scanf("%d", &j);

        for (int i = 0; i < count; i++) {
            if (database[i].jersey == j) {
                printf("\nFound: %d %s %d %d %d\n",
                       database[i].jersey,
                       database[i].name,
                       database[i].runs,
                       database[i].wickets,
                       database[i].matches);
                found = 1;
                break;
            }
        }
    } else if (choice == 2) {
        printf("Enter Name: ");
        scanf(" %[^\n]", name);

        for (int i = 0; i < count; i++) {
            if (strcmp(database[i].name, name) == 0) {
                printf("\nFound: %d %s %d %d %d\n",
                       database[i].jersey,
                       database[i].name,
                       database[i].runs,
                       database[i].wickets,
                       database[i].matches);
                found = 1;
                break;
            }
        }
    } else {
        printf("Invalid Choice!\n");
        return;
    }

    if (!found) printf("Player Not Found!\n");
}

// ----update details------
void updatePlayer() {
    int j, found = 0;

    printf("Enter Jersey: ");
    scanf("%d", &j);

    for (int i = 0; i < count; i++) {
        if (database[i].jersey == j) {
            printf("New Runs: ");
            scanf("%d", &database[i].runs);

            printf("New Wickets: ");
            scanf("%d", &database[i].wickets);

            printf("New Matches: ");
            scanf("%d", &database[i].matches);

            saveToFile();
            printf("Updated!\n");
            found = 1;
            break;
        }
    }

    if (!found) printf("Player Not Found!\n");
}

// -----sorted display-------
void displaySorted() {
    if (count == 0) {
        printf("No Data!\n");
        return;
    }

    Player temp[MAX];
    for (int i = 0; i < count; i++) temp[i] = database[i];

    for (int i = 0; i < count - 1; i++) {
        for (int j = i + 1; j < count; j++) {
            if (temp[i].runs < temp[j].runs) {
                Player t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
            }
        }
    }

    printf("\n--- Sorted by Runs ---\n");
    printf("%-10s %-20s %-10s %-10s %-10s\n",
           "JERSEY", "NAME", "RUNS", "WICKETS", "MATCHES");

    for (int i = 0; i < count; i++) {
        printf("%-10d %-20s %-10d %-10d %-10d\n",
               temp[i].jersey,
               temp[i].name,
               temp[i].runs,
               temp[i].wickets,
               temp[i].matches);
    }
}

// ----main fn-------
int main() {
    int choice;

    loadFromFile();

    do {
        printf("\n=====!! INDIAN CRICKET PLAYERS MANAGEMENT SYSTEM !!=====");
        printf("\n1. Add Player");
        printf("\n2. Remove Player");
        printf("\n3. Search Player");
        printf("\n4. Update Player");
        printf("\n5. Display Sorted");
        printf("\n6. Display All");
        printf("\n7. Exit");

        printf("\nEnter Choice: ");

        if (scanf("%d", &choice) != 1) {
            clearBuffer();
            continue;
        }

        switch (choice) {
            case 1: addPlayer(); break;
            case 2: removePlayer(); break;
            case 3: searchPlayer(); break;
            case 4: updatePlayer(); break;
            case 5: displaySorted(); break;
            case 6: displayTable(); break;
            case 7: printf("Exiting...\n"); break;
            default: printf("Invalid Choice!\n");
        }

    } while (choice != 7);

    return 0;
}
