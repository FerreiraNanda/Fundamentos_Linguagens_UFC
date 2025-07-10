#include <stdio.h>

// Função que recebe um inteiro por valor
void alterarPorValor(int x) {
    x = 100;
    printf("[alterarPorValor] x alterado para %d dentro da função.\n", x);
}

// Função que recebe um ponteiro (por referência)
void alterarPorReferencia(int *x) {
    *x = 100;
    printf("[alterarPorReferencia] x alterado para %d dentro da função.\n", *x);
}

int main() {
    int a = 10;
    int b = 10;

    printf("Antes de alterarPorValor, a = %d\n", a);
    alterarPorValor(a);
    printf("Depois de alterarPorValor, a = %d\n\n", a);

    printf("Antes de alterarPorReferencia, b = %d\n", b);
    alterarPorReferencia(&b);
    printf("Depois de alterarPorReferencia, b = %d\n", b);

    return 0;
}

