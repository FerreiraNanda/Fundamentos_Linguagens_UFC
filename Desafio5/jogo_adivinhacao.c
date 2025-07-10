#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int n_secreto, palpite;
    int tentativas = 0;
    const int maxTentativas = 5;

    srand(time(NULL));
    n_secreto = rand() % 100 + 1;

    printf("Jogo de Adivinhação\\n");
    printf("Tente adivinhar o número entre 1 e 100.\\nVocê tem %d tentativas.\\n", maxTentativas);

    while (tentativas < maxTentativas) {
        printf("Tentativa %d: ", tentativas + 1);
        scanf("%d", &palpite);

        if (palpite < 1 || palpite > 100) {
            printf("Entrada invalida Digite um numero entre 1 e 100.\\n");
            continue; 
        }

        tentativas++;

        if (palpite == n_secreto) {
            printf("Você acertou o numero em %d tentativa(s)!\\n", tentativas);
            break; 
        } else if (palpite < n_secreto) {
            printf("O numero e maior que %d.\\n", palpite);
        } else {
            printf("O numero e menor que %d.\\n", palpite);
        }
    }

    if (palpite != n_secreto) {
        printf("Voce perdeu O numero era %d.\\n", n_secreto);
    }

    return 0;
}
