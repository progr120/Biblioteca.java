package Java_Lambda;

import java.util.function.Function;

public class DobroDeX {
    public static void main(String[] args) {
        Function<Integer, Integer> dobro = (numero) -> numero * 2;

        int numero = 10;
        int ris = dobro.apply(numero);

        System.out.println("O dobro de " + numero + " é = " + ris);
    }
}
