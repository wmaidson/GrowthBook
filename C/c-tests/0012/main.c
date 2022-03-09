#include <stdio.h>

// Soma, Produto, Media, Menor, Maior

int main() {
    int n1, n2, n3;
    int sum, product, average, lowest, highest;

    printf("Enter the first number:\n");
    scanf("%i", &n1);

    printf("Enter the second number:\n");
    scanf("%i", &n2);

    printf("Enter the third number:\n");
    scanf("%i", &n3);

    sum = n1 + n2 + n3;

    average = sum / 3;

    product = n1 * n2 * n3;

    if(n1 >= n2 && n1 >= n3) {
        highest = n1;
    }

    if(n2 >= n1 && n2 >= n3) {
        highest = n2;
    }

    if(n3 >= n1 && n3 >= n2) {
        highest = n3;
    }

    if(n1 <= n2 && n1 <= n3) {
        lowest = n1;
    }

    if(n2 <= n1 && n2 <= n3) {
        lowest = n2;
    }

    if(n3 <= n1 && n3 <= n2) {
        lowest = n3;
    }

    printf("\nThe sum is %i", sum);

    printf("\nThe product is %i", product);

    printf("\nThe average is %i", average);

    printf("\nThe highest is %i", highest);

    printf("\nThe lowest is %i", lowest);


    return 0;
}
