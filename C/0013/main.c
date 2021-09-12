#include <stdio.h>

// Calculaa soma dos inteiros de 1 a 10

int main(void) {

    int sum, x; // declara a variavel sum e x

    x = 1; // inicializa x
    sum = 0; // icializa sum

    while(x <= 10) { // Loop while x e menor ou igual a 10
        sum += x; // Soma x a variavel sum
        ++x; // Incrementa o X
    }

    printf("The sum is: %d\n", sum);

    return 0;
}
