#include <stdio.h>

int fatorial(int n) {
    if (n <= 1)
        return 1;
    else
        return n * fatorial(n - 1);
}

int main() {
    int num;
    printf ("Digite um valor para calcular o fatorial:\n");
    scanf("%d", &num);
    int resultado = fatorial(num);
    printf("\nFatorial de %d é %d\n", num, resultado);
    return 0;
}
