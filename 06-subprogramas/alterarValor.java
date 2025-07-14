import java.util.*;

class SubprogramasJava {
    public static void alterarPorValor(int x) {
        x = 100;
        System.out.println("Alterar por valor x alterado para " + x);
    }

    public static void alterarPorReferencia(int[] x) {
        x[0] = 100;
        System.out.println("Alterar por referencia x[0] alterado para " + x[0]);
    }

    public static void main(String[] args) {
        int a = 10;
        int[] b = {10};

        System.out.println("Antes de alterarPorValor, a = " + a);
        alterarPorValor(a);
        System.out.println("Depois de alterarPorValor, a = " + a);
        System.out.println();

        System.out.println("Antes de alterarPorReferencia, b[0] = " + b[0]);
        alterarPorReferencia(b);
        System.out.println("Depois de alterarPorReferencia, b[0] = " + b[0]);
    }
}

