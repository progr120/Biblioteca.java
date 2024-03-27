package Java_Lambda;

import java.util.function.BinaryOperator;

public class SomaNumeros {
    public static void main(String[] args) {
        BinaryOperator<Integer> soma = (a,b) -> a + b;

        int numero = 5;
        int numero2 = 10;
        int ris = soma.apply(numero, numero2);

        System.out.println(numero + " + " + numero2 + " = " + ris);
    }
}
