# Desafio 06 – Subprogramas

Este desafio tem como objetivo demonstrar a diferença entre passagem de parâmetros por valor e por referência em linguagem C. É interessante compreender esse conceitos para, com isso, entender o comportamento de variáveis dentro de funções e como manipular seus valores corretamente.

---

## Conceito

- Passagem por valor: A função recebe uma cópia da variável. Alterações feitas dentro da função não afetam o valor original.
- Por referência: A função recebe endereço da variável original (ponteiro). Alterações feitas dentro da função afetam diretamente o valor original.

---

## `alterarValor.c`

```c
#include <stdio.h>

void alterarPorValor(int x) {
    x = 100;
    printf("Alterar por valor x alterado para %d dentro da função.\\n", x);
}
void alterarPorReferencia(int *x) {
    *x = 100;
    printf("Alterar por referencia x alterado para %d dentro da função.\\n", *x);
}

int main() {
    int a = 10;
    int b = 10;

    printf("Antes de alterarPorValor, a = %d\\n", a);
    alterarPorValor(a);
    printf("Depois de alterarPorValor, a = %d\\n\\n", a);

    printf("Antes de alterarPorReferencia, b = %d\\n", b);
    alterarPorReferencia(&b);
    printf("Depois de alterarPorReferencia, b = %d\\n", b);

    return 0;
}

```
## Conclusão

No exemplo apresentado, a variável "a" foi passada por valor, o que significa que uma cópia de seu conteúdo foi enviada para a função alterarPorValor. Assim, qualquer modificação feita dentro da função afeta apenas a cópia, e não a variável original e por isso, a permanece com o valor 10 após a chamada da função.

Já a variável "b" foi passada por referência, por meio de um ponteiro. Nesse caso, a função alterarPorReferencia acessa diretamente o endereço de memória de b, permitindo que sua alteração afete a própria variável original. Como resultado, b passa a valer 100 após a execução da função.
