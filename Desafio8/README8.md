# Desafio 08 – Programação Orientada a Objetos

Para este desafio, foi implementado, na linguagem Java, uma classe abastrar "Transporte", e três subclasses "Carro", "Bicicleta" e "ônibus". Na Main, foi criada instâncias dessas subclasses e chama um método comum (mover), que se comporta diferente em cada tipo de transporte.

---

## Objetivo

- Criar uma classe base com atributos e métodos;
- Estender essa classe com subclasses especializadas;
- Utilizar o conceito de polimorfismo por meio de sobrescrita de métodos;
- Demonstrar a execução com diferentes tipos de objetos derivados da classe base.

---

### Hierarquia de Classes:

```
Transporte (classe abstrata)
├── Carro
├── Bicicleta
└── Onibus
```

---

## Funcionalidade

Cada tipo de transporte possui:

- Atributos:
  - nome (String)
  - velocidade (double)
- Método abstrato:
  - mover(): comportamento diferente em cada tipo de transporte

---

## Implementação Java

```java
import java.util.*;


abstract class Transporte {
    protected String nome;
    protected double velocidade;

    public Transporte(String nome, double velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public abstract void mover();
}


class Carro extends Transporte {
    public Carro(String nome, double velocidade) {
        super(nome, velocidade);
    }

    @Override
    public void mover() {
        System.out.println(nome + " esta se movendo a " + velocidade + " km/h pela estrada.");
    }
}


class Bicicleta extends Transporte {
    public Bicicleta(String nome, double velocidade) {
        super(nome, velocidade);
    }

    @Override
    public void mover() {
        System.out.println(nome + " esta pedalando a " + velocidade + " km/h na ciclovia.");
    }
}


class Onibus extends Transporte {
    public Onibus(String nome, double velocidade) {
        super(nome, velocidade);
    }

    @Override
    public void mover() {
        System.out.println(nome + " esta transportando passageiros a " + velocidade + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Transporte carro = new Carro("Fusca", 80);
        Transporte bicicleta = new Bicicleta("Caloi", 20);
        Transporte onibus = new Onibus("Ônibus Escolar", 60);

        carro.mover();
        bicicleta.mover();
        onibus.mover();
    }
}
```

---

## Conclusão

A implementação desenvolvida cumpre com os principais pilares da Programação Orientada a Objetos (POO), no caso, herança, abstração e polimorfismo.

A estrutura começa com uma classe abstrata Transporte, que define atributos comuns (nome, velocidade) e um método abstrato mover(), o qual serve como uma interface genérica de comportamento para todos os tipos de transporte. Essa classe funciona como uma superclasse genérica, representando qualquer meio de transporte de maneira abstrata.

A partir dela, foram criadas três subclasses, Carro, Bicicleta e Onibus. Cada uma herda da classe Transporte e implementa sua versão própria do método mover(), descrevendo como cada veículo se desloca. Isso caracteriza o uso de polimorfismo, permitindo que o mesmo método (mover) tenha comportamentos diferentes, dependendo da classe concreta do objeto.

Na classe principal Main, os objetos são declarados como do tipo Transporte, mas instanciados com as subclasses. Isso mostra como é possível manipular objetos de forma genérica, utilizando o tipo da superclasse, ao mesmo tempo em que se mantém o comportamento específico de cada subclasse, um dos benefícios do polimorfismo.
