#include <stdio.h>

void alterarPorValor(int x) {
    x = 100;
    printf("Alterar Por Valor x alterado para %d dentro da função.\n", x);
}

void alterarPorReferencia(int *x) {
    *x = 100;
    printf("Alterar por referencia x alterado para %d dentro da função.\n", *x);
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
