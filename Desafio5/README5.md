# Desafio 05 – Estruturas de Controle

Para essa desafio, foi implementado, em linguagem C, um jogo de adivinhação no qual o jogador tenta descobrir um número aleatório entre 1 e 100, com um limite de tentativas.

---

## Objetivo

- Demonstrar o uso de estrutura de seleção (`if`, `else if`, `else`);
- Aplicar estrutura de repetição(`while`);
- Utilizar comandos de controle de fluxo (`break`, `continue` e `return`).

---

## `jogo_adivinhacao.c`

```
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int n_secreto, palpite;
    int tentativas = 0;
    const int maxTentativas = 5;

    srand(time(NULL));
    n_secreto = rand() % 100 + 1;

    printf("\n Jogo de Adivinhação \n");
    printf("Tente adivinhar o número entre 1 e 100.\n Você tem %d tentativas.\n", maxTentativas);

    while (tentativas < maxTentativas) {
        printf("\nTentativa %d: ", tentativas + 1);
        scanf("%d", &palpite);

        if (palpite < 1 || palpite > 100) {
            printf("Entrada invalida Digite um numero entre 1 e 100.\\n");
            continue; 
        }

        tentativas++;

        if (palpite == n_secreto) {
            printf("Você acertou o numero em %d tentativa(s)!\n", tentativas);
            break; 
        } else if (palpite < n_secreto) {
            printf("O numero e maior que %d.\n", palpite);
        } else {
            printf("O numero e menor que %d.\n", palpite);
        }
    }

    if (palpite != n_secreto) {
        printf("\n\n Voce perdeu O numero era %d.\n", n_secreto);
    }

    return 0;
}
```
## Estruturas Utilizadas
![tabela_estruturas](tabela2.png)

## Conclusão 
O código construído usa estruturas de controle e nos mostra como são essenciais para definir o fluxo lógico de execução de um programa. Através do uso de laços, decisões condicionais e comandos de fluxo, é possível implementar interações dinâmicas e comportamentos realistas, mesmo em programas simples como um jogo de adivinhação.
