#include <stdio.h>

// Função de adição
int main(void) {

    int integer1;
    int integer2;
    int sum;

    printf("Digite o primeiro inteiro:\n");
    scanf("%d", &integer1);

    printf("Digite o segundo inteiro:\n");
    scanf("%d", &integer2);

    sum = integer1 + integer2;

    printf("A soma e %d\n", sum);

    return 0;
}