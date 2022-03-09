#include <stdio.h>

int main(void) {

    int x = 1, total, y;
    total = 0;

    while (x <= 10) {
        y = x * x;
        printf("%d\n", y );
        total += y;
        ++x;
    }

    printf("Total is %d\n", total);

    return 0;
}
