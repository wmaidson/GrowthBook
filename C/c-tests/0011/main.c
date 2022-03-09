#include <stdio.h>

int main(void ) {
    int x, y, z, result;

    printf("Enter tree integer:\n");
    scanf("%d%d%d", &x, &y, &z );

    result = x * y * z;
    printf("The product is %d\n", result);
    return 0;
}