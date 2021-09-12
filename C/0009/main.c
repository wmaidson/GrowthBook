#include <stdlib.h>
#include <stdio.h>

// Par ou Impar

int main(void) {

    int num;
    printf("type an integer: ");
    scanf("%d", &num);
    if(num %2 == 0) {
        printf("EVEN");
    } else {
        printf("ODD");
    }
}



