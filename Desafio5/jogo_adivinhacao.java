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
