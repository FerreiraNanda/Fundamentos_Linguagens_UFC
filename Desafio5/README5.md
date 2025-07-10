# Desafio 05 – Estruturas de Controle

Este desafio propõe a criação de um programa simples, utilizando estruturas fundamentais de controle em programação: seleção, repetição e fluxo condicional. A linguagem escolhida foi Java, e o contexto definido foi o de um jogo de adivinhação, onde o usuário tenta descobrir um número aleatório.

---

## Objetivo

- Utilizar estruturas de seleção (if, else if, else);
- Utilizar estrutura de repetição (while);
- Demonstrar comandos de controle de fluxo (break, continue);
- Criar um contexto original e interativo.

---

## `JogoAdivinhacao.java`

```java
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int maxTentativas = 5;
        int contador = 0;

        System.out.println(" Jogo de Adivinhacao");
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        System.out.println("Vc tem " + maxTentativas + " tentativas.");

        while (contador < maxTentativas) {
            System.out.print("\nTentativa " + (contador + 1) + ": ");
            tentativa = scanner.nextInt();

            if (tentativa < 1 || tentativa > 100) {
                System.out.println("Entrada invalida. Digite um numeero entre 1 e 100.");
                continue;
            }

            contador++;

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o numero em " + contador + " tentativa(s).");
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("O numero secreto eh maior que " + tentativa + ".");
            } else {
                System.out.println("O numero secreto eh menor que " + tentativa + ".");
            }
        }

        if (contador == maxTentativas) {
            System.out.println("\nVc perdeu. O numero era: " + numeroSecreto);
        }

        scanner.close();
    }
}
```

---

## Análise das Estruturas Usadas

| Estrutura         | Uso no Código                                                       |
|-------------------|---------------------------------------------------------------------|
| `if / else if / else` | Para verificar se o palpite está correto, maior ou menor que o número secreto |
| `while`           | Controla o número de tentativas realizadas                           |
| `continue`        | Ignora entradas inválidas fora do intervalo permitido               |
| `break`           | Encerra o loop ao acertar o número                                  |

---

## Conclusão

O código construído usa estruturas de controle e nos mostra como são essenciais para definir o fluxo lógico de execução de um programa. Através do uso de laços, decisões condicionais e comandos de fluxo, é possível implementar interações dinâmicas e comportamentos realistas, mesmo em programas simples como um jogo de adivinhação.
