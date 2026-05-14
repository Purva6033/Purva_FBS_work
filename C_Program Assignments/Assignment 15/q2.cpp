#include <stdio.h>

// Define structure
struct Time {
    int hrs, min, sec;
};

// Function to display time
void display(struct Time t) {
    printf("%02d:%02d:%02d\n", t.hrs, t.min, t.sec);
}

// Function to add two times
struct Time addTime(struct Time t1, struct Time t2) {
    struct Time result;

    result.sec = t1.sec + t2.sec;
    result.min = t1.min + t2.min;
    result.hrs = t1.hrs + t2.hrs;

    // Handle seconds > 60
    if (result.sec >= 60) {
        result.min += result.sec / 60;
        result.sec = result.sec % 60;
    }

    // Handle minutes > 60
    if (result.min >= 60) {
        result.hrs += result.min / 60;
        result.min = result.min % 60;
    }

    return result;
}

// Function to convert time into seconds
int toSeconds(struct Time t) {
    return (t.hrs * 3600) + (t.min * 60) + t.sec;
}

int main() {
    struct Time t1, t2, sum;

    // Input first time
    printf("Enter first time (hrs min sec): ");
    scanf("%d %d %d", &t1.hrs, &t1.min, &t1.sec);

    // Input second time
    printf("Enter second time (hrs min sec): ");
    scanf("%d %d %d", &t2.hrs, &t2.min, &t2.sec);

    // Display entered times
    printf("\nTime 1: ");
    display(t1);

    printf("Time 2: ");
    display(t2);

    // Add times
    sum = addTime(t1, t2);

    printf("Sum of Time: ");
    display(sum);

    // Convert to seconds
    printf("\nTime 1 in seconds: %d\n", toSeconds(t1));
    printf("Time 2 in seconds: %d\n", toSeconds(t2));

    return 0;
}
