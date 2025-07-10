# Desafio 9 - Concorrência 

Foi desenvolvida uma aplicação em Java que simula o funcionamento de dois sensores operando simultaneamente. O objetivo foi demonstrar, de forma prática, o uso de threads, que são estruturas que permitem executar múltiplas tarefas ao mesmo tempo dentro de um mesmo programa.

---
### Estrutura da implementação

A implementação foi dividida em três partes principais:

1. Criação da classe `SensorTemperatura`
   Essa classe simula um sensor que lê valores de temperatura. Ela herda da classe `Thread`, o que significa que pode ser executada de forma independente.  
   No método `run()`, ela realiza 5 leituras aleatórias de temperatura (entre 20 e 30 graus Celsius), exibindo os valores com um intervalo de 1 segundo entre cada leitura.

2. Criação da classe `SensorUmidade` 
   De forma semelhante à anterior, essa classe simula um sensor de umidade. Também herda de `Thread` e, no método `run()`, realiza 5 leituras aleatórias de umidade (entre 40% e 60%), com um intervalo de 1,2 segundos entre elas.

3. Execução concorrente na classe principal (`ConcorrenciaSensores`)  
   No método `main()`, são criadas instâncias das duas classes de sensores. Em seguida, são chamados os métodos `start()` para iniciar ambas as threads.  
   Como resultado, as duas tarefas (leitura de temperatura e de umidade) passam a ser executadas em paralelo, de forma assíncrona, ou seja, uma não precisa esperar a outra terminar para continuar.

---

## Resultados observados

Essa simulação mostra, de maneira prática:

- A criação e execução de threads em Java;
- Como tarefas podem ser executadas ao mesmo tempo, sem bloquear a execução do restante do programa;
- Um exemplo realista e útil de concorrência, como em sistemas que precisam ler dados de múltiplos sensores, processar múltiplos usuários ou realizar operações em tempo real.
"""

# Desafio 09 – Concorrência

Este desafio aborda os conceitos fundamentais de **concorrência** e demonstra na prática a criação de **threads em Java** para executar tarefas simultâneas.

---

##  Diferença entre Threads e Processos

###  Processo
- Um processo é uma instância independente de um programa em execução.
- Possui seu próprio espaço de memória, pilha, variáveis, recursos do sistema.
- É mais isolado, porém mais custoso (em tempo e memória) para criar e gerenciar.

### Thread
- Uma thread é uma "linha de execução" dentro de um processo.
- Compartilha a memória e recursos com outras threads do mesmo processo.
- É mais leve e eficiente para tarefas simultâneas dentro do mesmo programa.
- Ideal para aplicações onde tarefas podem rodar em paralelo.

---

## Simulação de Sensores Concorrentes

O programa implementa duas threads:

- `SensorTemperatura`: simula a leitura periódica de temperatura;
- `SensorUmidade`: simula a leitura periódica de umidade.

Ambas executam em paralelo, com intervalos de tempo distintos entre as leituras, demonstrando a concorrência real.

---

## Implementação

```java
pimport java.util.*;


class SensorTemperatura extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            double temp = 20 + Math.random() * 10; // Temperatura entre 20 e 30
            System.out.printf("[Temperatura] Leitura %d: %.2f ºC%n", i, temp);
            try {
                Thread.sleep(1000); // pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Sensor de temperatura interrompido.");
            }
        }
    }
}

class SensorUmidade extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            double umidade = 40 + Math.random() * 20; // Umidade entre 40% e 60%
            System.out.printf("[Umidade] Leitura %d: %.2f%%%n", i, umidade);
            try {
                Thread.sleep(1200); // pausa de 1.2 segundos
            } catch (InterruptedException e) {
                System.out.println("Sensor de umidade interrompido.");
            }
        }
    }
}

public class ConcorrenciaSensores {
    public static void main(String[] args) {
        SensorTemperatura tempSensor = new SensorTemperatura();
        SensorUmidade umidadeSensor = new SensorUmidade();

        tempSensor.start();
        umidadeSensor.start();
    }
}
```
---

## Conclusão

Nessa implementação, buscou-se criar e executar threads em Java, mostando como tarefas podem ser executadas ao mesmo tempo sem bloquear a execução do restante do programa. Dessa forma, usando o sensores na implementação, mostrou-se como ocorre a concorrência em sistemas que precisam ler dados de múltiplos sensores, processar múltiplos usuários ou realizar operações em tempo real.

