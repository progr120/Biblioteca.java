package Java_Lambda;

import java.util.function.Predicate;

public class VerificaPar {
    public static void main(String[] args) {
        Predicate<Integer> ehPar = numero -> numero % 2 == 0;

        int numero = 5;

        if(ehPar.test(numero)){
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }
    }
}
