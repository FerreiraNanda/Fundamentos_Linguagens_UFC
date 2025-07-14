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
