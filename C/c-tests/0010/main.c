#include <stdio.h>

int main()
{
    int n;
    int divisao;
    printf("Digite um numero: ");
    scanf("%d", &n);
    divisao=n/2;
    if (n==divisao*2)
    {
        printf("o seu numero eh par");
    }
    else
    {
        printf("o seu numero eh impar");
    }
}
